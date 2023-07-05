package com.LimeRoadPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {

	private WebDriver driver;
	
	public SearchProduct() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="kids_category")
	private WebElement click_Kids;

	@FindBy(xpath="//a[text()='t-shirts'][3]")
	private WebElement click_Tshirt;
	
	@FindBy(xpath="//img[@loading='eager'][1]")
	private WebElement select_ImageShirt;
	
	@FindBy(xpath="// span[text()=' 3-4 Y '] ")
	private WebElement select_Shirt_Size;
	
	@FindBy(xpath="// div[text()='ADD TO CART'] ")
	private WebElement click_AddToCart;


	public WebElement getClick_Kids() {
		return click_Kids;
	}

	public WebElement getClick_Tshirt() {
		return click_Tshirt;
	}

	public WebElement getSelect_ImageShirt() {
		return select_ImageShirt;
	}

	public WebElement getSelect_Shirt_Size() {
		return select_Shirt_Size;
	}

	public WebElement getClick_AddToCart() {
		return click_AddToCart;
	}
	
}
