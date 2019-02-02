package com.Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotaions3 
{
@BeforeMethod
public void browserLaunchAndLogin()
{
	System.out.println("Firefox Browser Launch and Login to Gmail");
}
@Test(priority=0)
public void InBox()
{
	System.out.println("Testing Inbox functionality");
}
@Test(priority=1)
public void composeMail()
{
	System.out.println("Testing composeMail functionality");
}
@AfterMethod
public void closingApplication()
{
	System.out.println("Closing Gmail Application");
}
}
