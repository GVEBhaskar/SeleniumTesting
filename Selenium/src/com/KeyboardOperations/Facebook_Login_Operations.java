package com.KeyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

public class Facebook_Login_Operations 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.opera.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\operadriver.exe");
		WebDriver driver = null;
		driver = new OperaDriver();
		String url = "http://facebook.com";
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys("basubsc85@gmail.com");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("GVEBhaskar").perform();
		act.sendKeys(Keys.ENTER).perform();

	}

}
