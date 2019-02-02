package com.OHRM_login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Attribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		
		String url = "http://localhost/orangehrm-2.6/login.php";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.className("loginText")).sendKeys("admin");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("admin").perform();
		act.sendKeys(Keys.ENTER).perform();
		
		String ChangePassword=driver.findElement(By.linkText("Change Password")).getAttribute("href");
		System.out.println(ChangePassword);
		
	}

}
