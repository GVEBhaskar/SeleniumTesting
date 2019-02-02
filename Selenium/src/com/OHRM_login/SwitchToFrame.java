package com.OHRM_login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToFrame 
{

	public static void main(String[] args) throws InterruptedException
	{
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
		
		WebElement admin=driver.findElement(By.xpath("//*[@id=\'admin\']/a/span"));
		act.moveToElement(admin).perform();
		
		WebElement CompanyInfo=driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[1]/a/span"));
		act.moveToElement(CompanyInfo).perform();
		
		driver.findElement(By.xpath("//*[@id=\'admin\']/ul/li[1]/ul/li[1]/a/span")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\'rightMenu\']")));
		
	//driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div[2]/div[2]")));
		driver.findElement(By.id("editBtn")).click();
		driver.findElement(By.id("txtCompanyName")).sendKeys("LIVE TECH");
		act.sendKeys(Keys.TAB).perform();
		//act.sendKeys("LIVE TECH").perform();
		//act.sendKeys(Keys.TAB).perform();
		act.sendKeys("001").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("NA").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("9059647648").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("08932239465").perform();
		driver.findElement(By.id("cmbCountry")).sendKeys("India");
		
		//driver.findElement(By.xpath("//*[@id=\'cmbCountry\']/option[100]")).sendKeys("India");
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("Secunderabad").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("Krishna Nagar").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("Hyderabad").perform();
		Thread.sleep(1500);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("Telangana").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("500082").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("Nothing").perform();
		
		driver.findElement(By.id("editBtn")).click();
		driver.navigate().back();
		

	}

}
