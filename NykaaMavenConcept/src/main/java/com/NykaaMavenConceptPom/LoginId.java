package com.NykaaMavenConceptPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ProjectConceptBase.BaseClass;

public class LoginId extends BaseClass{
	public LoginId(WebDriver driver1) {
		driver=driver1;
		PageFactory.initElements(driver, this);
	}
	 @FindBy (xpath="//button[text()='Sign in']")
	 private WebElement signIn;
	 public WebElement getsignIn(){
		 return signIn;
	 }
	 
	 @FindBy (xpath="//button[text()='Sign in with Mobile / Email']")
     private WebElement mobile;
	 public WebElement getmobile(){
		 return mobile;
	 }
    
	 @FindBy (xpath="//input[@name='emailMobile']")
	 private WebElement id1;
	 public WebElement getsid1(){
		 return id1;
	 }
    
     @FindBy (id="submitVerification")
     private WebElement submit;
     public WebElement getsubmit(){
		 return submit;
	 }
    
     @FindBy(xpath="//button[text()='verify']")
     private WebElement verify;
     public WebElement getverify(){
		 return verify;
	 }

}
