package com.SeleniumConcept;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
		
		WebDriver w=new ChromeDriver();

		w.get("https://www.facebook.com/");
		
		w.manage().window().maximize();
		
		WebElement id = w.findElement(By.id("email"));
		id.sendKeys("7094534806");
		
		w.findElement(By.id("pass")).sendKeys("gdhgdjhd");
		
		w.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
