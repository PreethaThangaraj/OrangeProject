package com.LimeRoadPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Lime {

	private WebDriver driver;
	
	@FindBy(xpath="//span[text()='SHOP MEN']")
	private WebElement click_ShopMen;
	
	public Pom_Lime(WebDriver driv) {
		driver=driv;
	PageFactory.initElements(driver, this);
	}

	public WebElement getClick_ShopMen() {
		return click_ShopMen;
	}
	
}