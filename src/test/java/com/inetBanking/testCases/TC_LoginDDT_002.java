package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;
import com.inetBanking.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass{
	
@Test(dataProvider="LoginData")
public void loginDDt(String user,String pwd)
{
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(user);
	logger.info("username provided");
	lp.setPassword(pwd);
	logger.info("password provided");
	lp.clickSubmit();
	if(isAlertPresent()==true)
	{
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		Assert.assertTrue(false);
		logger.warn("login failed");
	}
	else
	{
		Assert.assertTrue(true);
		logger.info("login passed");
		lp.clickLogout();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
	}
}

public boolean isAlertPresent()
{
	try
	{
	driver.switchTo().alert();
	return true;
	}
	catch(Exception e)
	{
		return false;
	}
}
	
@DataProvider(name="LoginData")
String[][] getData() throws IOException
{
	String path=System.getProperty("user.dir")+"/src/test/java/com/inetBanking/testData/testdata.xlsx";
    int rownum=XLUtils.getRowCount(path, "Sheet1");
    int columncount=XLUtils.getCellCount(path, "Sheet1", 1);
    String logindata[][]=new String[rownum][columncount];
    
    for(int i=1;i<=rownum;i++)
    {
    	for(int j=0;j<columncount;j++)
    	{
    		logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
    	}
    }
    return logindata;
}
}
