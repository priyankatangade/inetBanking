package com.inetBanking.testCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddNewCustomer;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddNewCustomer_003 extends BaseClass{

	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(Username);
		logger.info("username is provided");
		lp.setPassword(Password);
		logger.info("password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddNewCustomer addcust=new AddNewCustomer(driver);
		logger.info("customer info is provided");
		addcust.clickAddNewCustomer(); 
		addcust.custName("Priya");
		addcust.custgender("Female");
		addcust.custdob("10","06","1990");
		Thread.sleep(2000);
		addcust.custadd("Street1");
		addcust.custcity("Pune");
		addcust.custstate("Maharashtra");
		addcust.custPinno(142568);
		addcust.custtelephone("9823985612");
		String email=randomString()+"@gmail.com";
		addcust.custemail(email);
		addcust.custpass("abcd");
		addcust.custsubmit();
		logger.info("Customer detail added successfully");
		
		//Thread.sleep(2000);
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
	 if(res==true)
	 {
		
		 Assert.assertTrue(true);
		 logger.info("test case is passed");
	 }
	 else
	 {
		 logger.info("test case is failed");
		 captureScreen(driver,"addNewCustomer");
		 Assert.assertTrue(false);
	 }
	}
	
	
}
