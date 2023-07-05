package com.NykaaProject.base;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class BaseClass {

static WebDriver driver;
	public static void screenShot(String path) {
		TakesScreenshot ts = (TakesScreenshot).driver; //casting
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("");
		FileHandler.copy(scr, des);
	}
}
