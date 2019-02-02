package com.Alert_PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell 5570\\Desktop\\Bhaskar_Selenium\\Selenium\\driverFiles\\geckodriver.exe");
		WebDriver driver = null;
		driver = new FirefoxDriver();
		String url = "http://apsrtconline.in/oprs-web/";
		driver.get(url);
		
		driver.findElement(By.id("searchBtn")).click();
		Alert alt=driver.switchTo().alert();
		String alert_Message=alt.getText();
		System.out.println(alert_Message);
		Thread.sleep(5000);
		alt.accept();
		//alt.dismiss();
		//alt.sendKeys(arg0);

	}

}
