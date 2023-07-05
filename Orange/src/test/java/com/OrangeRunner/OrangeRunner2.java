package com.OrangeRunner;

import org.testng.annotations.Test;

import com.OrangeBase.Base_Orange;
import com.OrangePom.PageObjectManager_Orge;

public class OrangeRunner2 extends Base_Orange {
	PageObjectManager_Orge pom = new PageObjectManager_Orge();
	@Test
	private void launchBrowser() {
		browserLaunch("edge");
		launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test
	private void loginOrange() {
		inputToElement(pom.getOrg().getClick_UserName(), "Admin");
		inputToElement(pom.getOrg().getEnter_Password(), "admin123");
		elementToBeClick(pom.getOrg().getEnter_SubmitButton());
	}

}
