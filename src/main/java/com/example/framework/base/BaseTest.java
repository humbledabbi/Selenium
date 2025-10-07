package com.example.framework.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest {
	protected WebDriver driver;
	
	
	@Parameters("browser")
	@BeforeSuite
	public void setUp(String browser) {
		DriverFactory.initDriver(browser);
		this.driver = DriverFactory.getDriver();
	}
	
	@AfterSuite
	public void tearDown() {
		DriverFactory.quitDriver();
	}
	
}
