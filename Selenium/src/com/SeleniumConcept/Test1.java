package com.SeleniumConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
		
		WebDriver wb = new ChromeDriver();
		
		wb.get("https://youtube.com/");
		
		String title = wb.getTitle();
		System.out.println(title);
		
		String currentUrl = wb.getCurrentUrl();
		System.out.println(currentUrl);
		
	    wb.manage().window().maximize();
	    
	    wb.navigate().to("https://web.whatsapp.com/");
	    
	    wb.navigate().back();
	    
	    wb.navigate().forward();
	    
	    wb.navigate().refresh();
	   
	}
}


