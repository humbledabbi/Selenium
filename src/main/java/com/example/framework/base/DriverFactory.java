package com.example.framework.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
	
	private static final ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		return DRIVER.get();
		}
	
	public static void initDriver(String browser) {
		if (DRIVER.get() == null) {
			switch (browser.toLowerCase()) {
			case "chrome":
			default:
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--start-maximized");
				DRIVER.set(new ChromeDriver(options));
				break;
					
			}
		}
	}
	
	public static void quitDriver() {
		WebDriver driver = DRIVER.get();
		if (driver != null) {
			driver.quit();
			DRIVER.remove();
		}
	}
	
}
