package com.banking.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebelementObjects {
	WebDriver localdriver;
	public WebelementObjects(WebDriver remotedriver)
	{
		localdriver = remotedriver;
		PageFactory.initElements(remotedriver, this);
		
	}
	
	@FindBy(xpath="//i[@class='fa fa-user']")
	WebElement MyAccount;
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
	WebElement MyAccountRegister;
	
	@FindBy(name="firstname")
	WebElement txtFirstNameRegister;
	
	@FindBy(name="lastname")
	WebElement txtLastNameRegister;
	
	@FindBy(name="email")
	WebElement txtEmailRegister;
	
	@FindBy(name="telephone")
	WebElement txtTelephoneRegister;
	
	@FindBy(name="password")
	WebElement txtPasswordRegister;
	
	@FindBy(name="confirm")
	WebElement txtConfirmPasswordRegister;
	
	@FindBy(name="agree")
	WebElement chkboxAgreeRegister;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btnContinueRegister;
	
	@FindBy(name="//a[@href='https://demo.opencart.com/index.php?route=account/login']")
	WebElement MyAccountLogin;
	
	@FindBy(id="input-email")
	WebElement txtEmailLogin;
	
	@FindBy(name="input-password")
	WebElement txtPasswordLogin;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btnLogin;
	
	public void getMyAccount()
	{
		MyAccount.click();
	}
	
	public void getMyAccountLogin()
	{
		MyAccountLogin.click();
	}
	public void settxtEmailLogin(String uname)
	{
		txtEmailLogin.sendKeys(uname);
	}
}
