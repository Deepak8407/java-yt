package com.ecommerce.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecommerce.PageObjects.EcomLoginPage;

public class TC_Login_001 extends EcomBaseClass
{
	@Test
	public void LoginTest() throws InterruptedException
	{
		driver.get(baseURL);
		driver.manage().window().maximize();
		EcomLoginPage lgp = new EcomLoginPage(driver);
		lgp.setUserName(username);
		Thread.sleep(2000);
		lgp.setPassword(password);
		Thread.sleep(2000);
		lgp.clickLogin();
		Thread.sleep(2000);  
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
			
		
	}

}
