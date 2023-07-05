package com.OrangePom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeBase.Base_Orange;

public class LoginPage extends Base_Orange {
private WebDriver driver;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy()
	private WebElement enter_UserName;
	
	@FindBy()
	private WebElement enter_Password;
	
	@FindBy()
	private WebElement click_LoginButton;

	
	public WebElement getEnter_UserName() {
		return enter_UserName;
	}

	public WebElement getClick_LoginButton() {
		return click_LoginButton;
	}

	public WebElement getEnter_Password() {
		return enter_Password;
	}
	
}
