package com.SeleniumConcept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test11 {

	public static void main(String[] args) throws AWTException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
			
			WebDriver w=new ChromeDriver();
			w.get("https://www.amazon.in/");
			w.manage().window().maximize();
			
            WebElement mobile = w.findElement(By.xpath("//a[text()='Mobiles']"));
            mobile.click();
// TO PERFORM THE RIGHT CLICK OPTION IN MOUSE  
            WebElement select = w.findElement(By.xpath("(//span[@dir='auto'])[8]"));
            Actions a = new Actions(w);
            a.contextClick(select).build().perform();
            
// ROBOT-It performs keyboard function
          Robot r= new Robot(); 
          r.keyPress(KeyEvent.VK_DOWN);
          r.keyPress(KeyEvent.VK_DOWN);
          r.keyRelease(KeyEvent.VK_ENTER);
          r.keyRelease(KeyEvent.VK_ENTER);
            
	}

}
