package com.ecommerce.TestCases;

import org.testng.annotations.Test;

import com.ecommerce.PageObjects.AddCustomerPage;
import com.ecommerce.PageObjects.EcomLoginPage;


public class TC_AddNewCustTest_002 extends EcomBaseClass
{
//	private static final String RandomStringUtils = "8";
	@Test
	public void addnewCustomer() throws InterruptedException
	{
		driver.get(baseURL);
		
		EcomLoginPage lp = new EcomLoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		
		AddCustomerPage cpg = new AddCustomerPage(driver);
		cpg.ClickAddNewCustomer();
		Thread.sleep(3000);
		cpg.AddtxtCustName("Deepak");
		//cpg.SetrdGender("male");
		//click to close add
		cpg.SetCustDOB("09", "18", "1994");
		Thread.sleep(3000);
		cpg.SetCustAddress("Pune");
		cpg.SetCustCity("Chichwad");
		cpg.SetCustState("Maharashtra");
		cpg.SetCustCityPin(411057);
		cpg.SetCustMobNO("7083328630");
		cpg.SetCustEmail("deepakyadav8408@gmail.com");
		cpg.SetCustPassword("123456");
		cpg.ClickSubmit();
		
		
		Thread.sleep(3000);
		}
//	public String randomtext()
//	{
//		String generatedstring=RandomStringUtils.randomAlphabetic(8);
//		return(generatedstring);
//	}
//	
}
