package com.OrangeRunner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeBase.Base_Orange;

public class googleRunner extends Base_Orange {

    @BeforeMethod()
	private void launchbrowser() {
		browserLaunch("chrome");
		launchUrl("https://www.google.com/");
	}
	@Test
	private void elementPass() {
		driver.findElement(By.name("q")).sendKeys("colours",Keys.ENTER);
	}
	
	@Test
	private void passTheElement() {
		driver.findElement(By.name("q")).sendKeys("FLOWER",Keys.ENTER);
	}
	
	@AfterMethod()
	private void takeScreenShot() throws IOException, Exception {
		Thread.sleep(2000);
		screenShot("google");
	}
}
