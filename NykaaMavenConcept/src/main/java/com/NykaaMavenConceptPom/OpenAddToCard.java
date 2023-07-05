package com.NykaaMavenConceptPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenAddToCard {
	@FindBy (xpath="//button[@class='css-aesrxy']")
	private WebElement openCard;
	public WebElement openCard() {
		return openCard;
	}
	@FindBy (css="iframe[src='/mobileCartIframe?ptype=customIframeCart']")
	private WebElement frame1;
	public WebElement getframe1() {
		return frame1;
	}
	
	@FindBy	(xpath="//img[@src='https://adn-static1.nykaa.com/media/wysiwyg/Payments/down.svg']")
	private WebElement clickDownArrow;
	public WebElement getclickDownArrow() {
		return clickDownArrow;
	}
	@FindBy (xpath="//p[text()='Select Quantity']")
	private WebElement quantity;
	public WebElement getquantity() {
		return quantity;
	}
	@FindBy (xpath="(//div[@class='css-bfwsku'])[3]")
	private WebElement selectThree;
	public WebElement getselectThree() {
		return selectThree;
	}
	
	@FindBy (xpath="//span[text()='Proceed']")
	private WebElement proceed;
	public WebElement getproceed() {
		return proceed;
	}
}
