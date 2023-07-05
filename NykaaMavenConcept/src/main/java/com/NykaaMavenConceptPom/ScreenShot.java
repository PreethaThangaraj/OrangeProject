package com.NykaaMavenConceptPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ProjectConceptBase.BaseClass;

public class ScreenShot extends BaseClass {
	@FindBy (xpath="//button[text()='Close']")
	private WebElement  close ;
	public WebElement getclose() {
		return close ;
	}
}
