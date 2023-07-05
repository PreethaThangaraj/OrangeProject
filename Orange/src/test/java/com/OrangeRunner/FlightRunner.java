package com.OrangeRunner;

import org.testng.annotations.Test;

import com.FlightPom.PageObjectManager;
import com.OrangeBase.Base_Orange;

public class FlightRunner extends Base_Orange {
	
	PageObjectManager pom = new PageObjectManager();
@Test(priority=1)
	public void loginBrowser() {
		browserLaunch("chrome");
		launchUrl("https://www.goibibo.com/");
	}

@Test(priority=2)
public void pageLogin() throws InterruptedException {
	inputToElement(pom.getFhp().getEnter_MobileNum(), "6382199843");
	Thread.sleep(5000);
	elementToBeClick(pom.getFhp().getClick_continuebtn());
	Thread.sleep(2000);
}
@Test(priority=3)
public void searchFlight() throws Exception {
	implicitWait(5);
	elementToBeClick(pom.getFs().getSelect_RoundTrip());
	implicitWait(5);
	inputToElement(pom.getFs().getEnter_FromCity(), "Chennai");
    keyDown(1);

}
}
