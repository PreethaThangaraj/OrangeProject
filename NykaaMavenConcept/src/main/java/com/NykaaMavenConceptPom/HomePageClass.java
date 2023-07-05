package com.NykaaMavenConceptPom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ProjectConceptBase.BaseClass;

public class HomePageClass extends BaseClass {
public HomePageClass(WebDriver driver1) {
	driver=driver1;
	PageFactory.initElements(driver, this);
}
	
    @FindBy(xpath ="(//a[text()='Natural'])[1]")//to find xpath we have to use this FindBy
	//use private for using this WebElement variable
	//why here void is not return means void return value is null but we want webelement return type so we put webelement
	private WebElement natural;
    //create public method for webelement variable to access the webelement in another class 
	public WebElement getNatural() {
		return natural;
	}
	
	//WebElement natural = w.findElement(By.xpath(("(//a[text()='Natural'])[1]")));
	 
}
