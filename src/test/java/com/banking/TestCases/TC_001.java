package com.banking.TestCases;

import org.testng.annotations.Test;

import com.banking.PageObjects.WebelementObjects;

public class TC_001 extends BaseClass
{

@Test
public void loginTest() throws InterruptedException
{
	driver.get(baseURL);
	WebelementObjects wobj = new WebelementObjects(driver);
	wobj.getMyAccount();
	wobj.getMyAccountLogin();
	wobj.settxtEmailLogin(username);
	Thread.sleep(2000);
	driver.quit();
	
}
}
