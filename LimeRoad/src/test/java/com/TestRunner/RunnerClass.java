package com.TestRunner;


import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.LimeRoadBase.Base_Lime;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\User\\eclipse-workspace\\LimeRoad\\src\\test\\java\\com\\feature",
glue="com.StepDefinition",
monochrome=true,
dryRun=false,
strict=true,
tags="@smoketest",
plugin= {"pretty",
		"html:LimeReports/limeroad.html",
		"json:LimeReports/limeroad.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class RunnerClass extends Base_Lime {
//	public static WebDriver driver;
	
@BeforeClass
public static void browserLaunch() {
	launchBrowser("chrome");
}	
}
