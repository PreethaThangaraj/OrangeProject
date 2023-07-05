package com.NykaaMavenConceptPom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ProjectConceptBase.BaseClass;

public class ClearData extends BaseClass{
	
	@FindBy (xpath="(//div[@class='css-1qlrij7 e87w9870'])[9]")
	private WebElement clickBag;
	public WebElement getclickBag() {
		return clickBag;
	}
	
	@FindBy(xpath="//p[text()='Edit']")
	private WebElement clickEdit;
	public WebElement getclickEdit() {
		return clickEdit;
	}
	
	@FindBy(xpath="//iframe[@aria-hidden='true']")
	private WebElement enterFrame;
	public WebElement getenterFrame() {
		return enterFrame;
	}
	
	@FindBy (xpath="(//span[@class='css-175whwo ehes2bo0'])[2]")
	private WebElement clickElement;
	public WebElement getclickElement() {
		return clickElement;
	}
	@FindBy (xpath="//button[text()='Remove']")
	private WebElement clickRemove;
	public WebElement getclickRemove() {
		return clickRemove;
	}
	
}
