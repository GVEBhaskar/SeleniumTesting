package com.Annotations;

import org.testng.annotations.Test;

public class Annotations1 
{
@Test(priority=0)
public void browserLaunch()
{
	System.out.println("firefox browser launch");
}
@Test(priority=1)
public void LogIn()
{
	System.out.println("Gmail Login");
}
@Test (priority=2)
public void InBox()

{
System.out.println("Testing InBox Functionality");	
}
@Test(enabled=false)
public void composeMail()
{
	System.out.println("Testing composeMail Functionality");
}
	
}
