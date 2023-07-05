package com.ProjectConcept1;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertClass {
static String search="Mobile";
public static void main(String[] args) {
	SoftAssert s = new SoftAssert();
	s.assertEquals(search, "mobile");
	Assert.assertEquals(true, search.contains("bil"));
	
}
}
