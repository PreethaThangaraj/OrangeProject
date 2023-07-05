package com.SeleniumConcept;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test10 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
			
			WebDriver w=new ChromeDriver();
			w.get("https://www.nykaa.com/");
			w.manage().window().maximize();
  // manually if click jus move the cursor to some web element there exit lot of option.below method is used in automation			
			WebElement body = w.findElement(By.xpath("(//a[text()='Bath & Body'])[1]"));
            WebElement lotion = w.findElement(By.xpath("//a[text()=' Body Lotions & Moisturizers']"));
            Actions a = new Actions(w);
 //   moving one element to another without clicking         
            a.moveToElement(body).build().perform();
 //   to select the exact web element
            a.click(lotion).build().perform();
            
            
        Set<String> windowHandles = w.getWindowHandles();
        for (String string : windowHandles) {
			String title = w.switchTo().window(string).getTitle();
			System.out.println(title);
		}
        w.findElement(By.xpath("//span[text()='₹493']")).click();
            
        
            Set<String> windowHandles2 = w.getWindowHandles();
            for (String string2 : windowHandles2) {
            	
				String title2 = w.switchTo().window(string2).getTitle();
				System.out.println(title2);
			}
            w.findElement(By.xpath("(//button[@type='button'])[8]")).click();
            w.findElement(By.xpath("(//button[@type='button'])[1]")).click();
       
	}

}
