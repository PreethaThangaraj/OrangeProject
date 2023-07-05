package com.OrangePom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeBase.Base_Orange;

public class OrangeAddEmp extends Base_Orange{

	public OrangeAddEmp() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement click_Pim;
	
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement select_AddEmp;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement enter_FirstName;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement enter_lastName;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement click_SaveBtn;
	
//	@FindBy(xpath="//button[text()=' Save '][1]")
//	private WebElement clickOnSaveBtn;
	
	public WebElement getClick_Pim() {
		return click_Pim;
	}

//	public WebElement getClickOnSaveBtn() {
//		return clickOnSaveBtn;
//	}

	public WebElement getSelect_AddEmp() {
		return select_AddEmp;
	}

	public WebElement getEnter_FirstName() {
		return enter_FirstName;
	}

	public WebElement getEnter_lastName() {
		return enter_lastName;
	}

	public WebElement getClick_SaveBtn() {
		return click_SaveBtn;
	}
	
}
