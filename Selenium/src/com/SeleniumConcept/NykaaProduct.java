package com.SeleniumConcept;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NykaaProduct {
/*
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
			
			WebDriver w=new ChromeDriver();
			w.get("https://www.nykaa.com/");
			w.manage().window().maximize();
			WebElement natural = w.findElement(By.xpath(("(//a[text()='Natural'])[1]")));
            WebElement hairoil = w.findElement(By.xpath("//a[text()=' Hair Oil']"));
            Actions a = new Actions(w);
            a.moveToElement(natural).build().perform();
            a.click(hairoil).build().perform();
            
            JavascriptExecutor j = (JavascriptExecutor)w;
        	j.executeScript("window.scrollBy(0,2000)");
        	
        	Set<String> windowHandles = w.getWindowHandles();
           for (String string : windowHandles) {
			String title = w.switchTo().window(string).getTitle();
			System.out.println(title);
		}
           
           WebElement nykaaoil = w.findElement(By.xpath("//div[text()='Nykaa Naturals Essential Oil']"));
           nykaaoil.click();
           
           Set<String> windowHandles2 = w.getWindowHandles();
           for (String string : windowHandles2) {
           String title1 = w.switchTo().window(string).getTitle();
           System.out.println(title1);
		}
           Thread.sleep(500);
           w.findElement(By.xpath("//div[@class='css-l13z72']//span[text()='Add to Bag']")).click();
           List<WebElement> clickAddToBag = w.findElements(By.xpath("//div[@class='css-0 e1ewpqpu1']"));
           for (WebElement webElement : clickAddToBag) {
			webElement.click();
           }
           Thread.sleep(1000);
           WebElement click1 = w.findElement(By.id("app"));
           w.switchTo().frame(click1);
           //quantity select
           w.findElement(By.xpath("(//img[@alt='Image'])[2]")).click();
		}*/
	}


