package com.OrangeRunner;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.OrangeBase.Base_Orange;
import com.OrangePom.PageObjectManager_Orge;

public class Runner_OrangeClass extends Base_Orange {
	PageObjectManager_Orge pom = new PageObjectManager_Orge();
	@BeforeTest
	private void browserLaunch() {
        browserLaunch("chrome");
		launchUrl("https://www.orangehrm.com/");

	}
	@BeforeTest
	private void browserUrl() {
		browserLaunch("edge");
		launchUrl("https://www.orangehrm.com/");
	}
	@BeforeMethod
	private void loginOrange() {
		inputToElement(pom.getLog().getEnter_UserName(), "Admin");
		inputToElement(pom.getLog().getEnter_Password(),"admin123");
		elementToBeClick(pom.getLog().getClick_LoginButton());
	}
	@Test
	private void validateTitle(){
		
	}
	@AfterMethod
	private void takeScreenShot() throws IOException, Exception {
		Thread.sleep(2000);
		screenShot("orangepic");
}
	@AfterTest
	private void terminatePage() {
		
	}
}