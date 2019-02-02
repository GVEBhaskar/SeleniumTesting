package com.OHRM_login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
WebDriver driver = null;
driver = new ChromeDriver();

String url = "http://localhost/orangehrm-2.6/login.php";
driver.get(url);
driver.manage().window().maximize();

driver.findElement(By.className("button")).click();
Alert alt=driver.switchTo().alert();

System.out.println(alt.getText());
Thread.sleep(5000);
alt.accept();
driver.quit();
	}

}
