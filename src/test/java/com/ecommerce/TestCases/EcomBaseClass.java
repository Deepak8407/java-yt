package com.ecommerce.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.ecommerce.Utilities.Read_config;

public class EcomBaseClass {
	Read_config readconfig = new Read_config();
	
	//public String baseURL="https://demo.guru99.com/v4/";
		public String baseURL=readconfig.getApplicationURL();
	//public String username="mngr392856";
		public String username=readconfig.getUserName();
	//public String password="zudymej";
		public String password=readconfig.getPassword();
	public static WebDriver driver;
	
//	@Parameters("browser") 
	@BeforeClass
	public void setup()
	{
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
		driver = new ChromeDriver();
//		if(br.equals("chrome"))
//		{
//		System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
//		driver = new ChromeDriver();
//		}
//		else if(br.equals("MicrosoftEdge"))
//		{
//		System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
//		driver = new ChromeDriver();	
//		}
		
		
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
}
