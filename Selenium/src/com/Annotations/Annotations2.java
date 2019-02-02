package com.Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 
{
@BeforeTest
public void browserLaunchAndLogin()
{
	System.out.println("Firefox Browser launch and Login to Gmail");
}
@Test(priority=0)
public void Inbox()
{
	System.out.println("Testing Inbox functionality");
}
@Test(priority=1)
public void composeMail()
{
	System.out.println("Testing composeMail functionality");
}
@AfterTest
public void applicationClose()
{
	System.out.println("closing Gmail Application");
}
	
}
