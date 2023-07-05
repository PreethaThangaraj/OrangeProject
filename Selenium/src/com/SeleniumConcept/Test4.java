package com.SeleniumConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws IOException{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
			
			WebDriver w=new ChromeDriver();
			
    w.get("https://www.nykaa.com/skin/cleansers/face-wash/c/8379");
    w.manage().window().maximize();

   w.findElement(By.xpath("(//span[@class='title '])[1]")).click();
   
   w.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("WOW");
   
   w.findElement(By.xpath("//label[@for='checkbox_WOW_2454']")).click();
   
   w.findElement(By.xpath("//img[@alt='WOW Skin Science Brightening Vitamin C Face Wash With Brush For Hyperpigmentation']")).click();
   
   w.findElement(By.xpath("(//button[@type='button'])[5]")).click();
  TakesScreenshot ts=(TakesScreenshot)w;
  File source = ts.getScreenshotAs(OutputType.FILE);
  File des = new File("C:\\Users\\User\\eclipse-workspace\\Selenium\\Screenshot\\nykaa.png");
  FileUtils.copyFile(source, des);
   
   
	}

}
