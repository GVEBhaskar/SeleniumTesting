package com.Log4j;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.istack.logging.Logger;

public class OHRM_LogInTest 
{
	//public static Logger Logger = Logger.getLogger("OHRM_LoginTest");
	public static Logger logger=Logger.getLogger("OHRM_LogInTes", null);
	WebDriver driver = null;
	String url="https://opensource-demo.orangehrmlive.com/";
	String userName = "Admin";
	String password = "admin123";
	
	@BeforeTest
	public void setUp()
	{
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Bhaskar_Selenium\\Selenium\\driverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		Logger.info("Chrome Browser Launched Successfully");
		driver.get(url);
		Logger.info("Successfully navigated to Orange Hrm home page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void logIn()
	{
		driver.findElement(By.id("txtUserName")).sendKeys("userName");
		Logger.info("Enter UserName Successfully");
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		Logger.info("Enter Password Successfully");
		driver.findElement(By.name("submit")).click();
		Logger.info("Click on Submit Button");
		
		String expected_Text = "Welcome Admin";
		Logger.info("expected_Text");
		String actual_Text = driver.findElement(By.id("welcome")).getText();
		Logger.info("actual_Text");
		
		if (actual_Text.equals(expected_Text))
		{
			Logger.info("LogIn Successful - PASS");
		}
		else
		{
			Logger.info("LogIn failed - FAIL");
			
		}
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("logout")).click();
		Logger.info("Application Logout");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		Logger.info("Application close");
	}

}
