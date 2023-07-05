package com.SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
			 WebDriver w=new ChromeDriver();
			 w.get("https://demoqa.com/alerts");
			 w.manage().window().maximize();
			 
		//	 WebElement name = w.findElement(By.id("alertButton"));
		//	 name.click();
		//	 Thread.sleep(2000);
		//	 w.switchTo().alert().accept();
			 
        //     WebElement confirm = w.findElement(By.id("confirmButton"));
		//	 confirm.click();
		//	 w.switchTo().alert().dismiss();
			 
			 WebElement prompt = w.findElement(By.id("promtButton"));
			 prompt.click();
			
			 String text = w.switchTo().alert().getText();
			 System.out.println(text);
			 Thread.sleep(1000);
			 w.switchTo().alert().sendKeys("java");
			 w.switchTo().alert().accept();
			 
	}

}
