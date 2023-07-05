package com.LimeRoadPom;

import com.LimeRoadBase.Base_Lime;
public class PageObjManager extends Base_Lime  {
	
	private Pom_Lime login;
//	private WebDriver driver ;
	private SearchProduct sp;
	
	
	public SearchProduct getSp() {
		sp= new SearchProduct();
		return sp;
	}
	public Pom_Lime getLogin() {
		login = new  Pom_Lime(driver);
		return login;
	}
	public static void main(String[] args) {
		

	}

}
