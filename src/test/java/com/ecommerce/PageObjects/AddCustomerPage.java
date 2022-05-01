package com.ecommerce.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How;

public class AddCustomerPage {
	WebDriver lcdriver;
	public AddCustomerPage(WebDriver rtdriver)
	{
		lcdriver = rtdriver;
		PageFactory.initElements(rtdriver, this);
	}
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement AddNewCustomer;
	
	@FindBy(how = How.NAME, using = "name")
	@CacheLookup
	WebElement txtCustName;
	
	@FindBy(how = How.NAME, using ="name")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how = How.NAME, using = "dob")
	@CacheLookup
	WebElement CustDOB;
	
	@FindBy(how = How.NAME, using ="addr")
	@CacheLookup
	WebElement CustAddress;
	
	@FindBy(how = How.NAME, using ="city")
	@CacheLookup
	WebElement CustCity;
	
	@FindBy(how = How.NAME, using ="state")
	@CacheLookup
	WebElement CustState;
	
	@FindBy(how = How.NAME, using ="pinno")
	@CacheLookup
	WebElement CustCityPin;
	
	@FindBy(how = How.NAME, using ="telephoneno")
	@CacheLookup
	WebElement CustMobNO;
	
	@FindBy(how = How.NAME, using ="emailid")
	@CacheLookup
	WebElement CustEmail;
	
	@FindBy(how = How.NAME, using ="password")
	@CacheLookup
	WebElement CustPassword;
	
	@FindBy(how = How.XPATH, using ="//input[@type=\"submit\"]")
	@CacheLookup
	WebElement Submit;
	
	public void ClickAddNewCustomer()
	{
		AddNewCustomer.click();
	}
	
	public void AddtxtCustName(String cname)
	{
		txtCustName.sendKeys(cname);
	}
	
	public void SetrdGender(String cgender)
	{
		txtCustName.sendKeys(cgender);
	}
	
	public void SetCustDOB(String mm,String dd,String yy)
	{
		CustDOB.sendKeys(mm);
		CustDOB.sendKeys(dd);
		CustDOB.sendKeys(yy);
	}
	
	
	public void SetCustAddress(String caddress)
	{
		CustAddress.sendKeys(caddress);
	}
	
	public void SetCustCity(String ccity)
	{
		CustCity.sendKeys(ccity);
	}
	
	public void SetCustState(String cstate)
	{
		CustState.sendKeys(cstate);
	}
	public void SetCustCityPin(int cpin)
	{
		CustCityPin.sendKeys(String.valueOf(cpin));
	}
	
	public void SetCustMobNO(String cmobno)
	{
		CustMobNO.sendKeys(cmobno);
	}
	
	public void SetCustEmail(String cemail)
	{
		CustEmail.sendKeys(cemail);
	}
	
	public void SetCustPassword(String cpass)
	{
		CustPassword.sendKeys(cpass);
	}
	
	public void ClickSubmit()
	{
		Submit.click();
	}
	
}
	
	