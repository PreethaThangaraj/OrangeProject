package com.SeleniumConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraProduct {
    static WebDriver driver;
	static int i;
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
	}
public static void getMinPrice() {
	List<WebElement> allMinPrice = driver.findElements(By.xpath("//span[@class='product-strike']/preceding-sibling::span[@class='product-discountedPrice']"));
	List<Integer>newpricelist=new ArrayList<Integer>();
for(WebElement DisPrice:allMinPrice) {
	System.out.println(DisPrice);
	String size=DisPrice.getText();
    String replaceAll = size.replaceAll("Rs. ", " ");
    System.out.println(replaceAll);
    i = Integer.parseInt(replaceAll);
	newpricelist.add(i);
}	
Collections.sort(newpricelist);
System.out.println(newpricelist);
Integer min = Collections.min(newpricelist);
System.out.println(min);
}
		
	public static void main(String[] args) {
	browserLaunch();
    getMinPrice();
	}

}
