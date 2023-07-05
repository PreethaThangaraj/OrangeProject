package com.ProjectConcept1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.ProjectConceptBase.BaseClass;

public class DependsOnMetclass extends BaseClass {
	@Test
	public void login() {
		System.out.println("login method");
	}
	@Test
	public void search() {
		System.out.println("Search the product");
	}
	@Test(priority = 0,dependsOnMethods="search")
	public void select() {
		System.out.println("Select the item");
	}
	@Test
	public void addToCard() {
		System.out.println("Add the product");
	}
	@Ignore
	@Test(dependsOnMethods="addToCard")
	public void payment() {
		System.out.println("Pay for the product");
	}
	

}
