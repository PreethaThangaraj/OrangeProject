package com.OrangePom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeBase.Base_Orange;

public class OrangeSearchEmp extends Base_Orange{
	public OrangeSearchEmp() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Employee List']")
	private WebElement click_Emplist;
	
    @FindBy(xpath="//button[@type='submit']")
    private WebElement click_SelectBtn;
    
    @FindBy(xpath="//input[@placeholder='Type for hints...'][1]")
    private WebElement enter_NameOfEmp;
    
	public WebElement getEnter_NameOfEmp() {
		return enter_NameOfEmp;
	}

	public WebElement getClick_SelectBtn() {
		return click_SelectBtn;
	}

	public WebElement getClick_Emplist() {
		return click_Emplist;
	}
}
