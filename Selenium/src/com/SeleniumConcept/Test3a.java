package com.SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3a {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
			
			WebDriver w=new ChromeDriver();
			
			w.get("https://www.amazon.in/");
			
			w.manage().window().maximize();
			
			WebElement search = w.findElement(By.id("twotabsearchtextbox"));
			search.sendKeys("Mobiles");
			
		    w.findElement(By.xpath("//input[@type='submit']")).click();
		    
		    w.findElement(By.xpath("//span[text()='OnePlus']")).click();
		    
		    w.findElement(By.xpath("//span[contains(text(),'OnePlus Nord CE 3 Lite 5G (Chromatic Gray, 8GB RAM, 128GB Storage)')]")).click(); 

		    WebElement addcard = w.findElement(By.xpath("//input[@value='Add to Cart']"));
		    addcard.click();
		    
		    w.findElement(By.xpath("(//input[@type='submit'])[7]")).click();
		    
		    
	}

}
