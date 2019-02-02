package com.OHRMApplicationLogInTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OHRM_LogInTest
{

	WebDriver driver = null;
	String url = "https://opensource-demo.orangehrmlive.com/";
	
	String UserName = "Admin";
	String Password = "admin123";


@Given("^Open Chrome Browser and navigate to Orange HRM Application$")
public void Open_Chrome_Browser_and_navigate_to_Orange_HRM_Application() 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Bhaskar_Selenium\\Cucumber\\DriverFiles\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@When("^User enters valid userName and Password and click$")
public void User_enters_valid_userName_and_Password_and_click() 
{
   driver.findElement(By.id("txtUsername")).sendKeys(UserName);
   driver.findElement(By.id("txtPassword")).sendKeys(Password);
   driver.findElement(By.id("btnLogin")).click();
}

@Then("^User should be able to successfully logIn to the application and close the application$")
public void User_should_be_able_to_successfully_logIn_to_the_application_and_close_the_application() throws IOException 
{
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
