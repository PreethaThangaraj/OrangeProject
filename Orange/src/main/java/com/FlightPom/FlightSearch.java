package com.FlightPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeBase.Base_Orange;

public class FlightSearch extends Base_Orange {
	public FlightSearch(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[text()='Round-trip']//parent::li[@class='sc-12foipm-81 hYqPGw'])")
	private WebElement select_RoundTrip;
	
	public WebElement getSelect_RoundTrip() {
		return select_RoundTrip;
	}
	
	@FindBy(xpath="//p[text()='Enter city or airport'][1]")
	private WebElement enter_FromCity;
	
	public WebElement getEnter_FromCity() {
		return enter_FromCity;
	}
//	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div[1]/div[1]/div/div[2]/div/input")
//	private WebElement from;
//	
//	public WebElement getFrom() {
//		return from;
//	}
	
	@FindBy(xpath = "/	html/body/div[1]/div[3]/div/div/div[1]/div[2]/div/div[2]/div/input")
	private WebElement to;
	
	public WebElement getTo() {
		return to;
	}
	
	@FindBy(xpath = "//div[@aria-label='Mon Jul 10 2023']")
	private WebElement departuredate;
	
	public WebElement getDeparturedate() {
		return departuredate;
	}
	
	
	@FindBy(xpath = "//span[text()='Return']")
	private WebElement comeback;
	
	public WebElement getComeback() {
		return comeback;
	}
	
	@FindBy(xpath = "//div[@aria-label='Thu Jul 20 2023']")
	private WebElement returnDate;
	
	public WebElement getReturnDate() {
		return returnDate;
	}
	
	@FindBy(xpath = "//span[text()='Done']")
	private WebElement done;
	
	public WebElement getDone() {
		return done;
	}
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div[1]/div[5]/div[2]/div[2]/div/div[1]/div[1]/div/span[3]/svg/path")
	private WebElement adultincrease;
	
	public WebElement getAdultincrease() {
		return adultincrease;
	}
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div[1]/div[5]/div[2]/div[2]/div/div[1]/div[2]/div/span[3]/svg/path")
	private WebElement childincrease;
	
	public WebElement getChildincrease() {
		return childincrease;
	}
	
	@FindBy(xpath = "//a[text()='Done']")
	private WebElement done1;
	
	public WebElement getDone1() {
		return done1;
	}
	
	@FindBy(xpath = "//span[text()='SEARCH FLIGHTS']")
	private WebElement searchflight;
	
	public WebElement getSearchflight() {
		return searchflight;
	}
}


