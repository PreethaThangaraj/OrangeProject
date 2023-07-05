package com.SeleniumConcept;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test22 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
		
		WebDriver w=new ChromeDriver(); 
		
		w.get("https://www.naukri.com/nlogin/login");
		
		w.manage().window().maximize();
		
		WebElement username = w.findElement(By.id("usernameField"));
		username.sendKeys("Jasmine");
		
		w.findElement(By.id("passwordField")).sendKeys("jas@25");
	
		WebElement login = w.findElement(By.xpath("//button[text()='Login']"));
		login.click();
		
	}

}
