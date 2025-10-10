package com.example.framework.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.framework.base.BaseTest;
import com.example.framework.pages.LoginPage;

public class LoginTests extends BaseTest {
	
	@Test(description = "First Login Test")
	public void successfulLogin() {
		super.driver.get("https://www.saucedemo.com/");
		LoginPage lp = new LoginPage(driver);
		lp.login("standard_user", "secret_sauce");
		
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"), "Should have navigated to inventory");
	}

}
