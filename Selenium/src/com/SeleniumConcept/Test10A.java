package com.SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test10A {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
		
		WebDriver w=new ChromeDriver();
		w.get("https://demoqa.com/droppable");
		w.manage().window().maximize();
		WebElement drag = w.findElement(By.id("draggable"));
		WebElement drop = w.findElement(By.id("droppable"));
		Actions a = new Actions(w);
		a.dragAndDrop(drag, drop).build().perform();
	}

}
