package com.SeleniumConcept;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class JavaScriptConcept {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\WebDriver\\chromedriver.exe");
		 WebDriver w=new ChromeDriver();
		 w.get("https://demoqa.com/alerts");
		 w.manage().window().maximize();
		 
		 WebElement name = w.findElement(By.id("alertButton"));
		 name.click();
		 w.switchTo().alert().accept();
		 
		 WebElement confirm = w.findElement(By.id("confirmButton"));
		 confirm.click();
		 JavascriptExecutor js= (JavascriptExecutor)w;
		 js.executeScript("dismiss");
		 //TAKE SCREENSHOT
		 TakesScreenshot ts = (TakesScreenshot)w;
		 File scr = ts.getScreenshotAs(OutputType.FILE);
		 File dest=new File("C:\\Users\\User\\eclipse-workspace\\Selenium\\Screenshot\\JavaScript.png");
		 FileHandler.copy(scr, dest); 

	}

}
