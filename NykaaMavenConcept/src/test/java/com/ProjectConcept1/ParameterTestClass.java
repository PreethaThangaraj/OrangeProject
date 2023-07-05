package com.ProjectConcept1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ProjectConceptBase.BaseClass;

public class ParameterTestClass extends BaseClass {
	@Parameters
	@Test
	public void login(String username,String password) {
		System.out.println("UserName is:" +username);
		System.out.println("Enter Password:"+password);
		
	}
}
