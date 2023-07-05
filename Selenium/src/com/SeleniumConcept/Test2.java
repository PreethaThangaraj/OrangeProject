package com.SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
		
		WebDriver w=new ChromeDriver(); 
		
		w.get("https://www.instagram.com/accounts/login/");
		
		w.manage().window().maximize();
		
		w.findElement(By.xpath("//input[@type='text']")).sendKeys("jasminethangaraj_7");
	
		
	}
}
