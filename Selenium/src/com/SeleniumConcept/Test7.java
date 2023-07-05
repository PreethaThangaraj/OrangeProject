package com.SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
		 WebDriver w=new ChromeDriver();
         w.get("https://demo.automationtesting.in/Frames.html");
         w.manage().window().maximize();
         
         w.switchTo().frame("singleframe");
         WebElement type = w.findElement(By.xpath("//input[@type='text']"));
         type.sendKeys("okay");

         w.switchTo().defaultContent();
         w.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
         
         w.switchTo().frame(1);
         w.switchTo().frame(0);
         WebElement send = w.findElement(By.xpath("//input[@type='text']"));
         send.sendKeys("enter");
	}

}
