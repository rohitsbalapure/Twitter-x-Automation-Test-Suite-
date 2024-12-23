package com.twitterautomation.testcases;

import org.testng.annotations.Test;  
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.twitterautomation.base.Base;
import com.twitterautomation.pages.LoginPage;

public class TestLoginPage extends Base{
	@BeforeMethod
	public void setUp() {
		initializeDriver();
	}
	@Test
	public void loginToTwitter() {
		driver.get("https://x.com/i/flow/login");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername("Enter Username");
		loginPage.enterPassword("Enter Password");
		
		System.out.println("The Title Page is :"+ driver.getTitle());   
	}
    @AfterMethod
	public void tearDown() {
		super.tearDown();
	}
    
}
