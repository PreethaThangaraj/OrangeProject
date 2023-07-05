package com.FlightPom;

import org.openqa.selenium.support.PageFactory;

import com.OrangeBase.Base_Orange;

public class PageObjectManager extends Base_Orange{
	public PageObjectManager(){
		PageFactory.initElements(driver, this);
	}
	
	
private FlightHomePage fhp;
private FlightSearch fs;
public FlightHomePage getFhp() {
	fhp = new FlightHomePage();
	return fhp;
}
public FlightSearch getFs() {
	fs = new FlightSearch();
	return fs;
}

}
