package com.OrangePom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeBase.Base_Orange;

public class OrangeHrmLogin extends Base_Orange {

	public OrangeHrmLogin() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	private WebElement click_UserName;
	
	@FindBy(name="password")
	private WebElement enter_Password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement enter_SubmitButton;

	public WebElement getClick_UserName() {
		return click_UserName;
	}

	public WebElement getEnter_Password() {
		return enter_Password;
	}

	public WebElement getEnter_SubmitButton() {
		return enter_SubmitButton;
	}
}
