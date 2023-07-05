package com.FlightPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeBase.Base_Orange;

public class FlightHomePage extends Base_Orange {
	public FlightHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="phone")
	private WebElement enter_MobileNum;

	public WebElement getEnter_MobileNum() {
		return enter_MobileNum;
	}
	
	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement click_continuebtn;

	public WebElement getClick_continuebtn() {
		return click_continuebtn;
	}

	
}
