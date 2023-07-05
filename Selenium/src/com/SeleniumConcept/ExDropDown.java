package com.SeleniumConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ExDropDown {

	public static void main(String[] args) {

			 System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
			 WebDriver w=new ChromeDriver();
             w.get("https://demoqa.com/select-menu");
             w.manage().window().maximize();
             WebElement single = w.findElement(By.id("oldSelectMenu"));
             Select s = new Select(single);
             
             s.selectByValue("4");
             s.selectByVisibleText("Black");
             s.selectByIndex(3);
             
             List<WebElement> options = s.getOptions();
             for(WebElement webElement:options) {
            	 System.out.println(webElement.getText());
             }
             System.out.println("-------------------");
             
             WebElement firstSelectedOption = s.getFirstSelectedOption();
             System.out.println(firstSelectedOption.getText());
	}

}
