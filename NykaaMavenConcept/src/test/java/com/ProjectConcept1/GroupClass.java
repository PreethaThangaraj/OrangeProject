package com.ProjectConcept1;

import org.testng.annotations.Test;
import com.ProjectConceptBase.BaseClass;

public class GroupClass extends BaseClass{
	@Test(groups="page")
	public void login() {
		System.out.println("login method");
	}
	@Test(groups="page")
	public void search() {
		System.out.println("Search the product");
	}
	@Test(priority = 0,groups="page",dependsOnMethods="search")
	public void select() {
		System.out.println("Select the item");
	}
	@Test(groups="pay")
	public void addToCard() {
		System.out.println("Add the product");
	}
	
	@Test(groups="pay",dependsOnMethods="addToCard")
	public void payment() {
		System.out.println("Pay for the product");
	}
	



}
