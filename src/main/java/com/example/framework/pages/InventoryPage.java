package com.example.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
	
	private WebDriver driver;
	
	private By bike_light_description = By.xpath("//div[text()='Sauce Labs Bike Light']/parent::a/following-sibling::div");
	
	public InventoryPage(WebDriver driver) {
		this.driver = driver;	
	}
	
	public String get_bike_light_description() {
		return driver.findElement(bike_light_description).getText();
	}
	
	
}
