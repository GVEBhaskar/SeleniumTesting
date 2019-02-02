package com.BasicJava;

public class MethodsExample 
{
	public void seleniumIde ()
	{
		System.out.println("PerformRecord and Playback");
	}
	public void seleniumWebdriver()
	{
		System.out.println("To develop Automation Scripts");
	}
	public void seleniumGrid()
	{
		System.out.println("To execute Scripts in Multiple Browsers and Systems");
	}

	public static void main(String[] args) 
	{
		MethodsExample m=new MethodsExample();
				m.seleniumGrid();
		m.seleniumWebdriver();
		m.seleniumIde();

	}

}
