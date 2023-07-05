package com.SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
		 WebDriver w=new ChromeDriver();
		 
		 w.get("https://www.facebook.com/campaign/");
		 
		 w.manage().window().maximize();
		 
         w.findElement(By.xpath("(//a[@role='button'])[2]")).click();
         
         w.findElement(By.name("firstname")).sendKeys("Rene");
         
         w.findElement(By.name("lastname")).sendKeys("Thayalan");
         
         w.findElement(By.xpath("(//input[@data-type='text'])[3]")).sendKeys("renethayalan7@gmail.com");
         
         w.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("renethayalan7@gmail.com");
         
         w.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Jamine@25");
         
         WebElement date = w.findElement(By.id("day"));
         Select s = new Select(date);
         s.selectByValue("7");
         
         WebElement month = w.findElement(By.id("month"));
         Select se = new Select(month);
         se.selectByIndex(11);
         
         WebElement year = w.findElement(By.id("year"));
         Select sel = new Select(year);
         sel.selectByVisibleText("2000");
         
         w.findElement(By.xpath("//label[text()='Female']")).click();
	}
	

}
