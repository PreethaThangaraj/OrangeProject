package com.ProjectConcept1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.ProjectConceptBase.BaseClass;

public class DataProviderTestClass extends BaseClass {
	@Parameters
	@Test
	public void login(String username,String password) {
		System.out.println("UserName is:" +username);
		System.out.println("Enter Password:"+password);
		
	}
	public Object[][] data(){
		String[][] s= new String[2][2];
		s[0][0]="username";
		s[0][1]="password";
		
		s[1][0]="abcd";
		s[1][1]="1234";
		return null;
		
	}
}
