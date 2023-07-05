package com.SeleniumConcept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) throws AWTException, InterruptedException{
	
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
				
				WebDriver w=new ChromeDriver();
				
				w.get("https://www.makemytrip.com/");
				 w.manage().window().maximize();
				 w.findElement(By.id("username")).sendKeys("6382199843");
				 w.findElement(By.xpath("//span[text()='Continue']")).click();
				 w.findElement(By.id("otp")).click();
				 Thread.sleep(10000);
				 w.findElement(By.xpath("//span[text()='Login']")).click();
			
			/*	 WebElement city = w.findElement(By.id("fromCity"));
				 city.sendKeys("CHENNAI");
				 Robot r = new Robot();
				 r.keyPress(KeyEvent.VK_DOWN);
				 r.keyRelease(KeyEvent.VK_DOWN);
				 r.keyPress(KeyEvent.VK_ENTER);
				 r.keyRelease(KeyEvent.VK_ENTER);
				 Thread.sleep(500);
				 WebElement destiny = w.findElement(By.id("toCity"));
				 destiny.sendKeys("NEW DELHI");
				 r.keyPress(KeyEvent.VK_DOWN);
				 r.keyRelease(KeyEvent.VK_DOWN);
				 r.keyPress(KeyEvent.VK_ENTER);
				 r.keyRelease(KeyEvent.VK_ENTER);
				
				 JavascriptExecutor j = (JavascriptExecutor)w;
		//		 j.executeScript("window.scrollBy(0,1000)");
				 
				 WebElement date = w.findElement(By.xpath("(//div[@role='gridcell'])[20]"));
				 j.executeScript("arguments[0].click()", date);
		//		 j.executeScript("window.scrollBy(0,-1000)");
		         Thread.sleep(500);
				 w.findElement(By.xpath("//a[text()='Search']")).click();
				 
				 */
						     
				 }

}


