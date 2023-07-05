package com.NykaaCucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\User\\eclipse-workspace\\NykaaMavenConcept\\src\\test\\java\\com\\NykaaCucumber\\feature\\nykaa.feature",glue="StepDefinition")

public class CucumberRunner {


}
