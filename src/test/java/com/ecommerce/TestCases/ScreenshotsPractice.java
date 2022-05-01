package com.ecommerce.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerforSrnshots.class)
public class ScreenshotsPractice extends BaseClassScreenshots{

	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void takeScreenshots()
	{
		Assert.assertEquals(false, true);
	}
}
