package com.NykaaMavenConceptPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ProjectConceptBase.BaseClass;

public class ProductEntry extends BaseClass {
	@FindBy (xpath="//select[@title='SIZE']")
			private WebElement quantity;
	public WebElement getquantity() {
		return quantity;
	}
   
    @FindBy (xpath="(//span[text()='Add to Bag'])[1]")
    private WebElement add;
    public WebElement getadd() {
    	return add;
    }
}
