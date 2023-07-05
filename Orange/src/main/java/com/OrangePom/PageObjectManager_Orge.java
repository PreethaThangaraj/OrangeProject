package com.OrangePom;

import org.openqa.selenium.support.PageFactory;

import com.OrangeBase.Base_Orange;

public class PageObjectManager_Orge extends Base_Orange{
	public PageObjectManager_Orge() {
		PageFactory.initElements(driver,this);
	}
	private LoginPage log;
    private OrangeHrmLogin org;
    private OrangeAddEmp ad;
    private OrangeSearchEmp search;
    
		public OrangeAddEmp getAd() {
			ad = new OrangeAddEmp();
	     return ad;
}
		public OrangeSearchEmp getSearch() {
			if(search==null) {
			search = new OrangeSearchEmp();
			}
			return search;
		}
		public LoginPage getLog() {
		log = new LoginPage();
		return log;
	}
	public OrangeHrmLogin getOrg() {
		org = new OrangeHrmLogin();
			return org;
		}
	public static void main(String[] args) {
		
	}
}
