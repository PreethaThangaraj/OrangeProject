package com.SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
		
		WebDriver w=new ChromeDriver();
		
		w.get("https://www.imdb.com/");

		w.manage().window().maximize();
		
		WebElement search = w.findElement(By.name("q"));
		search.sendKeys("soorarai pottru");
		w.findElement(By.id("iconContext-magnify")).click();
		
		WebElement find = w.findElement(By.xpath("(//img[@loading='lazy'])[1]"));
        find.click();
	}

}
