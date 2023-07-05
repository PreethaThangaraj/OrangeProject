package com.SeleniumConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IptSelenium {
	static int i;
	static Integer maxvalue;
	public static void getAllPrice() {	
		   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/men-tshirts");
		
	List<WebElement>discount=driver.findElements(By.xpath("//span[@class='product-strike']//preceding::span[@class='product-discountedPrice']"));
    List<Integer> list= new ArrayList<>();
	for (WebElement webElement : discount) {
	String text = webElement.getText();
	String replaceAll = text.replaceAll("Rs. ", "");
	System.out.println(replaceAll);
    int i = Integer.parseInt(replaceAll);
	list.add(i);
  }
	Collections.sort(list);
	System.out.println(list);
    maxvalue = Collections.max(list);
    System.out.println(maxvalue);
	}
	
public static void main(String[] args) {
	
	getAllPrice();
	}
	}

