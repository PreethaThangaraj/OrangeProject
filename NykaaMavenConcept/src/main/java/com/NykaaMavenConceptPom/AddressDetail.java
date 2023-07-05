package com.NykaaMavenConceptPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ProjectConceptBase.BaseClass;

public class AddressDetail extends BaseClass {
    @FindBy (xpath="//button[@class='css-n7wnfc e8tshxd0']")
	private WebElement address;
	public WebElement getaddress() {
		return address;
	}
}
