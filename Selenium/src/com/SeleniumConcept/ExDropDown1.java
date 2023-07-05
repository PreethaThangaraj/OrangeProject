package com.SeleniumConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExDropDown1 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
		 WebDriver w=new ChromeDriver();
         w.get("https://demoqa.com/select-menu");
         w.manage().window().maximize();
         WebElement single = w.findElement(By.id("cars"));
         Select s = new Select(single);
         s.selectByValue("1");
         s.selectByVisibleText("Opel");
         s.selectByIndex(3);
         
         List<WebElement> selectall = s.getAllSelectedOptions();
         for(WebElement WebElement:selectall) {
        	 System.out.println(WebElement.getText());
         }
  
         s.deselectByIndex(3);
         s.deselectAll();
         
	}

}
