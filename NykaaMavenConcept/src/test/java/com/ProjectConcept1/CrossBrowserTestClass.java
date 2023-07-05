package com.ProjectConcept1;

import org.testng.annotations.Test;
import com.ProjectConceptBase.BaseClass;


public class CrossBrowserTestClass extends BaseClass {
	@Test
	public void login() {
		launchUrl("url");
		System.out.println("login method");
	}
@Test
	public void search() {
		browserLaunch("chrome");
		System.out.println("Search the product");
	}
@Test
	public void select() {
		launchUrl("url");
		System.out.println("Select the item");
	}
@Test
	public void addToCard() {
		browserLaunch("chrome");
		System.out.println("Add the product");
	}
	
	public void payment() {
		launchUrl("url");
		System.out.println("Pay for the product");
	}
}
