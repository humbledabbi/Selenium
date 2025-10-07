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
	
	public void login(String user, String pass) {
		driver.findElement(user_name).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
	}
		
	

}
