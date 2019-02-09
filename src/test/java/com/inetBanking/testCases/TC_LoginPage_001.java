package com.inetBanking.testCases;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;


import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginPage_001 extends BaseClass {
	
	@Test
	public void LoginTest() throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(Username);
		logger.info("Username entered");
		lp.setPassword(Password);
		logger.info("password entered");
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("login is passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("login is failed");
		}
	}
	
	
}
