package com.NykaaMavenConceptPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ProjectConceptBase.BaseClass;

public class SelectProduct extends BaseClass{
	
	@FindBy(xpath="//img[@alt='Himalaya Baby Powder']")
	private WebElement hBabyPowder;
	public WebElement gethBabyPowder() {
		return hBabyPowder;
	}
	
}
