package com.SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
			
			WebDriver w=new ChromeDriver();
			
			w.get("https://www.amazon.in/");
			
			w.manage().window().maximize();
			w.findElement(By.cssSelector("input[autocomplete^=o]")).sendKeys("headphone wireless");
			w.findElement(By.cssSelector("input[type$=it]")).click();
			
			JavascriptExecutor j = (JavascriptExecutor)w;
			
			
			j.executeScript("window.scrollBy(0,1700)");
			
		//	WebElement enter = w.findElement(By.xpath("//span[text()='Deal of the Day']"));
		//	j.executeAsyncScript("arguments[0].scrollIntoView();", enter);
			
		//	WebElement click = w.findElement(By.xpath("//img[@alt='Sponsored Ad - boAt Rockerz 551ANC Newly Launched Hybrid Active Noise Cancellation Headphones with Up to 100H Playtime, AS...']"));
		//    j.executeScript("arguments[0].click();", click);
			
		//	w.findElement(By.cssSelector("img[alt^=Sp]")).click();
			WebElement enter = w.findElement(By.cssSelector("img[alt^=Sp]"));
			j.executeScript("arguments[0].click();", enter);
		    
		    j.executeScript("window.scrollBy(0,2000)");
		    

	}

}
