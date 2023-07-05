package com.NykaaMavenConceptPom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ProjectConceptBase.BaseClass;

public class CardDetail extends BaseClass{
    @FindBy (xpath="//input[@label='Card Number']")
	private WebElement cardNum;
	public WebElement getcardNum() {
		return cardNum;
	}
	 @FindBy(xpath="//input[@label='Expiry (MM/YY)']")
	private WebElement date;
	public WebElement getdate() {
		return date;
	} 
	 @FindBy (xpath="//input[@placeholder='CVV']")
    private WebElement cvvNum;
    public WebElement getcvvNum() {
    	return cvvNum;
    }
    @FindBy (xpath="//button[@class='css-v61n2j e8tshxd0']")
	private WebElement pay;
	public WebElement getpay() {
		return pay;
	}
	 @FindBy (xpath="//button[text()='Pay without securing card']")
		private WebElement confirmation;
		public WebElement getconfirmation() {
			return confirmation;
		}
}
