package com.SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teat7a {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
		 WebDriver w=new ChromeDriver();
         w.get("https://www.instagram.com/accounts/login/");
         w.manage().window().maximize();
         WebElement user = w.findElement(By.cssSelector("input[name=username]"));
         user.sendKeys("jasminethangaraj_7");
         w.findElement(By.cssSelector("input[type^=p]")).sendKeys("fgsahyfyas");
         
	}

}
