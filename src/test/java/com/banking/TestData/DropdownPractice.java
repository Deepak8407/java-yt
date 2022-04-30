package com.banking.TestData;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DropdownPractice {
public static WebDriver driver;
	
	
	@Test
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.globalsqa.com/demo-site/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//WebElement drag = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/div/div[2]/div[3]/ul/li[7]/a"));
		//js.executeScript("window.scrollBy(0,1000)");
		//js.executeScript("arguments[0].scrollIntoView();",drag);
	}
	

}
