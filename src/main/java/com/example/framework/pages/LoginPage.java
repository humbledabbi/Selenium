package com.example.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By user_name = By.id("user-name");
	private By password = By.id("password");
	private By login = By.name("login-button");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public InventoryPage login(String user, String pass) {
		driver.findElement(user_name).sendKeys(user); //standard_user
		driver.findElement(password).sendKeys(pass); //secret_sauce
		driver.findElement(login).click();
		return new InventoryPage(this.driver);
	}
		
	

}
