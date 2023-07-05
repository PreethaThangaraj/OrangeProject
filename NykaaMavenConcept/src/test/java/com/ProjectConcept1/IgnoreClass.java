package com.ProjectConcept1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.ProjectConceptBase.BaseClass;

public class IgnoreClass extends BaseClass {
	@Ignore
	@Test
	public void login() {
		System.out.println("login method");
	}
	@Test(priority = -1)
	public void search() {
		System.out.println("Search the product");
	}
	@Test(priority = 0)
	public void select() {
		System.out.println("Select the item");
	}
	@Test(priority = 1)
	public void addToCard() {
		System.out.println("Add the product");
	}
	@Ignore
	@Test(priority = 2)
	public void payment() {
		System.out.println("Pay for the product");
	}
	
}
