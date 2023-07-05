package com.NykaaMavenConceptPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.ProjectConceptBase.BaseClass;

public class SearchProduct extends BaseClass{
    
  @FindBy (xpath="//a[text()='mom & baby']")
 private WebElement babyProduct;
  public WebElement getbabyProduct() {
	  return babyProduct;
  }
    
  @FindBy (xpath="//a[text()='Baby Powder']")
   private WebElement babyPowder;
  public WebElement getbabyPowder() {
	  return babyPowder;
  }

}
