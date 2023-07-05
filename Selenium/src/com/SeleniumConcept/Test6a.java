package com.SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6a {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
		 WebDriver w=new ChromeDriver();
		 
		 w.get("https://www.facebook.com/");
		 w.manage().window().maximize();
		 
		 w.findElement(By.cssSelector("input#email")).sendKeys("jasminethangaraj7@gmail.com");
		 w.findElement(By.cssSelector("input#pass")).sendKeys("asdfgggggh");
		 w.findElement(By.name("login")).click();

	}

}
