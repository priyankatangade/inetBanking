package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How;
public class AddNewCustomer {

	WebDriver ldriver;
	
	public AddNewCustomer(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.LINK_TEXT, using="New Customer")
	WebElement lnkAddNewCustomer;
	
	@FindBy(how=How.NAME,using="name")
	WebElement txtCustomerName;
	
	@FindBy(how=How.NAME,using ="rad1")
	WebElement rdGender;
	
	@FindBy(how=How.ID_OR_NAME,using="dob")
	WebElement txtdob;
	
	@FindBy(how=How.NAME,using="addr")
	WebElement txtaddress;
	
	@FindBy(how=How.NAME,using="city")
	WebElement txtCity;
	
	@FindBy(how=How.NAME,using="state")
	WebElement txtState;
	
	@FindBy(how=How.NAME,using="pinno")
	WebElement txtPin;
	
	@FindBy(how=How.NAME,using="telephoneno")
	WebElement txtMobileNo;
	
	@FindBy(how=How.NAME,using="emailid")
	WebElement txtEmailid;
	
	@FindBy(how=How.NAME,using="password")
	WebElement txtPassword;
	
	
	@FindBy(how=How.NAME,using="sub")
	WebElement btnSubmit;
	
	
	@FindBy(how=How.NAME,using="res")
	WebElement btnReset;
	
	public void clickAddNewCustomer()
	{
		lnkAddNewCustomer.click();
	}
	
	public void custName(String cname)
	{
		txtCustomerName.sendKeys(cname);
	}
	
	public void custgender(String cgender)
	{
		rdGender.click();
	}
	
	public void custdob(String mm,String dd,String yy)
	{
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	
	public void custadd(String caddress)
	{
		txtaddress.sendKeys(caddress);
	}
	
	public void custcity(String ccity)
	{
		txtCity.sendKeys(ccity);
	}
	
	public void custstate(String cstate)
	{
		txtState.sendKeys(cstate);
	}
	
	public void custPinno(int cpinno)
	{
		txtPin.sendKeys(String.valueOf(cpinno));
	}
	
	public void custtelephone(String ctelephone)
	{
		txtMobileNo.sendKeys(String.valueOf(ctelephone));
	}
	
	public void custemail(String cemail)
	{
		txtEmailid.sendKeys(cemail);
	}
	
	public void custpass(String cpass)
	{
		txtPassword.sendKeys(cpass);
	}
	
	public void custsubmit()
	{
		btnSubmit.click();
	}
}
