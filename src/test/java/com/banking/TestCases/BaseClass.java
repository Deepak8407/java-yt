package com.banking.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BaseClass {
	public String baseURL="https://demo.opencart.com/";
	public String username = "deepakyadav8407@gmail.com";
	public String password = "123456";
	public static WebDriver driver;
	
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	//@AfterClass
//	public void teardown()
//	{
//		driver.quit();
//	}

//	@FindBy(xpath="//i[@class='fa fa-user']")
//	WebElement MyAccount;
//	
//	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
//	WebElement MyAccountRegister;
//	
//	@FindBy(name="firstname")
//	WebElement txtFirstNameRegister;
//	
//	@FindBy(name="lastname")
//	WebElement txtLastNameRegister;
//	
//	@FindBy(name="email")
//	WebElement txtEmailRegister;
//	
//	@FindBy(name="telephone")
//	WebElement txtTelephoneRegister;
//	
//	@FindBy(name="password")
//	WebElement txtPasswordRegister;
//	
//	@FindBy(name="confirm")
//	WebElement txtConfirmPasswordRegister;
//	
//	@FindBy(name="agree")
//	WebElement chkboxAgreeRegister;
//	
//	@FindBy(xpath="//input[@type='submit']")
//	WebElement btnContinueRegister;
//	
//	@FindBy(name="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
//	WebElement MyAccountLogin;
//	
//	@FindBy(id="input-email")
//	WebElement txtEmailLogin;
//	
//	@FindBy(name="input-password")
//	WebElement txtPasswordLogin;
//	
//	@FindBy(xpath="//input[@type='submit']")
//	WebElement btnLogin;
//	
	
}