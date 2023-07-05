package com.ProjectConceptBase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	protected static WebDriver driver;
    JavascriptExecutor js;
    Actions a;
public void browserLaunch(String browser) {
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	}
	else if(browser.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
}

public void launchUrl(String url) {	
	
	driver.get("url");
}


public void clickElement(WebElement element) {
	element.click();
}
public void sendElement(WebElement element,String value ) {
	element.sendKeys(value);
}
public void screenShot(String fileName) throws IOException {
	TakesScreenshot ts =(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\\\Users\\\\User\\\\eclipse-workspace\\\\Selenium\\\\Screenshot\\"+fileName+".png");
	FileHandler.copy(src, dest);
}
public void dropDown(WebElement element,String option,String value) {
	Select s =new Select(element);
	if(option.equals("value")) {
	s.selectByValue(value);
	}
	else if (option.equals("index")) {
	int index = Integer.parseInt(value);
	s.selectByIndex(index);
	}
	else if (option.equals("text"))
	{
	s.selectByVisibleText(value);
	}
}
public void scrollIntoElement(WebElement enter) {
    js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",enter);
}
public void scrollByValue(int xValue,int yValue) {
	js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy("+xValue+","+yValue+")");
}
public void clickUsingJSE(WebElement element) {
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",element);
}
public void inputUsingJSE(String id ,String Value) {
	js = (JavascriptExecutor)driver;
	js.executeScript("document.getElementById('"+id+"').value('"+Value+"');");
}
public void clickUsingJSE(String id , WebElement element) {
	js= (JavascriptExecutor)driver;
	js.executeScript("document.getElementById('"+id+"').click('"+element+"');");
}
public void acceptAlert(WebElement element) {
	element.click();
	driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();	
}
public void sendkeysAlert(WebElement element,String text,String name) {
	element.click();
	text =driver.switchTo().alert().getText();
	driver.switchTo().alert().sendKeys(name);
	driver.switchTo().alert().accept();
}
public void actionMouseHover(WebElement element) {
	a= new Actions(driver);
	a.moveToElement(element).build().perform();
}
public void contextClick(WebElement element) {
	a=new Actions(driver);
	a.contextClick(element).click().perform();
}
public void dragDrop(WebElement src,WebElement des) {
	a=new Actions(driver);
	a.dragAndDrop(src, des);
	
}
public void switchToFrame(String option,String value) {
	if(option.equals("index")) {
		int index = Integer.parseInt(value);
		driver.switchTo().frame(index);
	}else if ((option.equals("id"))||(option.equals("name"))){
		driver.switchTo().frame(value);
	}
	
}

public void switchFrameUsingElement(WebElement element) {
	driver.switchTo().frame(element);
}

public void switchWindow(int index) {
	Set<String> all_tab_id = driver.getWindowHandles();
	List<String> tab_id_list = new LinkedList<>(all_tab_id);
	
	driver.switchTo().window(tab_id_list.get(index));
	
}

public void keyDown(int noOfTimes) throws AWTException {
	Robot r = new Robot();
	
	for(int i=0;i<noOfTimes;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	
//	
//	r.keyPress(KeyEvent.VK_CONTROL);
//	r.keyPress(KeyEvent.VK_A);
//	r.keyRelease(KeyEvent.VK_A);
//	r.keyRelease(KeyEvent.VK_CONTROL);
	
}
	public static void main(String[] args) {
	

	}

}
