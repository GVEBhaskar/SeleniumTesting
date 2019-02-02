package com.BasicJava;

public class ObjectArray 
{

	public static void main(String[] args) 
	{
		Object a[]=new Object[3];
		a[0]=10;
		a[1]="Hello";
		a[2]=10.123;
		
		for (Object var:a)
		{
			System.out.println(var);
		}

	}

}
