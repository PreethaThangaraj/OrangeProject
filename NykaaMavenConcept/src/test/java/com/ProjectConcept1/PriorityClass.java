package com.ProjectConcept1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ProjectConceptBase.BaseClass;

public class PriorityClass extends BaseClass {
	public class RunnerClassMaven extends BaseClass {
		@BeforeSuite
	public void browserLaunch() {
		System.out.println("Launch Browser");
	}
	@BeforeTest
	public void launchUrl() {
		System.out.println("get url");
	}
	@BeforeClass
	public void productPurchase() {
		System.out.println("Methods for purchasing the product");
	}
	@BeforeMethod
	public void waitFor() {
		System.out.println("Methods to wait");
	}
	@Test(priority = -2)
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
	@Test(priority = 2)
	public void payment() {
		System.out.println("Pay for the product");
	}
	@AfterMethod
	public void refresh() {
		System.out.println("Refresh the page");	
	}
	@AfterClass
	public void deleteCookies() {
		System.out.println("Delete the cookies");
	}
	@AfterTest
	public void baseUrl() {
		System.out.println("Navigate to the base URL");
	}
	@AfterSuite
	public void close() {
		System.out.println("Close the browser");
	}
	}
	}
