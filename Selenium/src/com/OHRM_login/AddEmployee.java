package com.OHRM_login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell 5570\\Desktop\\Selenium Testing\\DriverFiles\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		
		String url = "http://localhost/orangehrm-2.6/login.php";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("admin").perform();
		act.sendKeys(Keys.ENTER).perform();
		
		WebElement PIM=driver.findElement(By.xpath("//*[@id=\'pim\']/a/span"));
		act.moveToElement(PIM).perform();
		
		driver.findElement(By.xpath("//*[@id=\'pim\']/ul/li[2]/a/span")).click();
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Ganugula");
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("VaraEswara").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("Bhaskar").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("Baasu").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("C:\\Users\\Dell 5570\\Desktop\\savitri\\60618mahanati-maya1.jpg").perform();

	}

}
