package com.SeleniumGrid;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OHRM_LogInTest 
{
	@Parameters("Browser")
	@Test
	public void logIn(String browser) throws IOException
	{
		//Setting the node info
		System.out.println("The name of the Browser is: "+browser);
		DesiredCapabilities cap=null;
		if(browser.equalsIgnoreCase("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else
			if(browser.equalsIgnoreCase("chrome"))
			{
				cap=DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
			}
		//Node is set
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL ("http://192.168.0.15:4444/wd/hub"), cap);
		String url = "https://opensource-demo.orangehrmlive.com/";
		String userName = "Admin";
		String password = "admin123";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			driver.findElement(By.id("txtUsername")).sendKeys(userName);
		   driver.findElement(By.id("txtPassword")).sendKeys(password);
		   driver.findElement(By.id("btnLogin")).click();
		   try
		    {
		    	String expected_Text = "Welcome Admin";
		    	System.out.println("The expected text is: "+expected_Text);
		    	
		    	String actual_Text = driver.findElement(By.id("welcome")).getText();
		    	System.out.println("The actual text is: "+actual_Text);
		    	
		    	if(actual_Text.contains(expected_Text))
		    	{
		    		System.out.println("Successfully LogIn - PASS");
		    	}
		    }
		    catch (Exception e)
		    {
		    	if(driver.findElement(By.id("spanMessage")).getText().equals("Invalid credentials"));
		    	File ScreenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    	FileUtils.copyFile(ScreenShot, new File("C:\\Users\\Dell 5570\\Desktop\\Bhaskar_Selenium\\Cucumber\\ScreenShot\\img.png"));
		    	System.out.println("LogIn Failed - FAIL");
		    	driver.close();
		    }
	}

}
