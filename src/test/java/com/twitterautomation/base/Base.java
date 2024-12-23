package com.twitterautomation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Base {
	
	public WebDriver driver;
	
	public void initializeDriver() {
		// Create an instance of FirefoxOptions
		FirefoxOptions options = new FirefoxOptions();
		
		// Add desired arguments to FirefoxOptions
		options.addArguments("--startMaximized");
		options.addArguments("--disable-notifications");
		
		// Initialize the FirefoxDriver with the options
		driver = new FirefoxDriver(options);
	}
	
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
