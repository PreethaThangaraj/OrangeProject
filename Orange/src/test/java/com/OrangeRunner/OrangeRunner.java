package com.OrangeRunner;

import org.testng.annotations.Test;
import com.OrangeBase.Base_Orange;
import com.OrangePom.PageObjectManager_Orge;

public class OrangeRunner extends Base_Orange {
	PageObjectManager_Orge pom = new PageObjectManager_Orge();
	@Test(priority=1)
	private void launchBrowser() {
		browserLaunch("chrome");
		launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(priority=2)
	private void loginOrange() throws Exception {
		Thread.sleep(3000);
		inputToElement(pom.getOrg().getClick_UserName(), "Admin");
		inputToElement(pom.getOrg().getEnter_Password(), "admin123");
		elementToBeClick(pom.getOrg().getEnter_SubmitButton());
	}
	@Test(priority=3)
	private void addEmpDetail() throws Exception {
		Thread.sleep(2000);
		elementToBeClick(pom.getAd().getClick_Pim());
		Thread.sleep(2000);
		elementToBeClick(pom.getAd().getSelect_AddEmp());
		Thread.sleep(2000);
		inputToElement(pom.getAd().getEnter_FirstName(), "Jasmine");
		inputToElement(pom.getAd().getEnter_lastName(), "T");
		elementToBeClick(pom.getAd().getClick_SaveBtn());
		Thread.sleep(2000);
        elementToBeClick(pom.getAd().getSelect_AddEmp());
	}
	@Test(priority=4)
	private void searchEmp() throws Exception {
		Thread.sleep(2000);
		elementToBeClick(pom.getSearch().getClick_Emplist());
		Thread.sleep(3000);
		inputToElement(pom.getSearch().getEnter_NameOfEmp(), "Jasmine T");
		keyDown(1);
		Thread.sleep(2000);
		elementToBeClick(pom.getSearch().getClick_SelectBtn());
	}
}
