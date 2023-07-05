package com.SeleniumConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
	static int i;
	static Integer min;
	public static void getAllPrice() {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
		
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.ajio.com/men-tshirts/c/830216014");
		
		List<WebElement>allprice=w.findElements(By.xpath("//span[@class='orginal-price']//preceding::span[@class='price  ']"));
		List<Integer>list=new ArrayList<>();
		for (WebElement webElement : allprice) {
			String text = webElement.getText();
			String replaceAll = text.replaceAll("₹", "");
		//	System.out.println(replaceAll);
			String replace1 = replaceAll.replace(",","");
			System.out.println(replace1);
	   	    int i = Integer.parseInt(replace1);
		    list.add(i);
		}
	//	System.out.println(list);
    	Collections.sort(list);
    	System.out.println("Collections.sort() :\n" + list);
    	Collections.sort(list,Collections.reverseOrder());
    	System.out.println("reverseorder:"+list);
    	Integer min = Collections.min(list);
	    System.out.println(min);
	}
	public static void brandName() {
//		WebDriver w=new ChromeDriver();
//		List<WebElement>shirtbrand=w.findElements(By.xpath("//span[@class='orginal-price']//preceding::span[text()='"+min+"']//preceding-parent::div[@class='brand']"));
//	    for (WebElement webElement1 : shirtbrand) {
//	    	String text1 = webElement1.getText();
//	    	System.out.println("The brand is:" +text1);
//		}
	
	
	}
public static void main(String[] args) {
	getAllPrice();
	
}
}
