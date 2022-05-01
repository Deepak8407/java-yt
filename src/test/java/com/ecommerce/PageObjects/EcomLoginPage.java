package com.ecommerce.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcomLoginPage {
			WebDriver lcdriver;
			public EcomLoginPage(WebDriver rtdriver)
			{
				lcdriver = rtdriver;
				PageFactory.initElements(rtdriver, this);
			}
		
			@FindBy(name="uid")
			WebElement txtUserName;
			
			@FindBy(name="password")
			WebElement txtpassword;
			
			@FindBy(name="btnLogin")
			WebElement btLogin;
			
			public void setUserName(String uname)
			{
				txtUserName.sendKeys(uname);
			}
			public void setPassword(String pass)
			{
				txtpassword.sendKeys(pass);
			}
			public void clickLogin()
			{
				btLogin.click();
			}
			
} 
