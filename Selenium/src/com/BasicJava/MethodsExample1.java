package com.BasicJava;

public class MethodsExample1 
{
	int a=10;
	int b=20;
	int c;
	public void add()
	{
		c=a+b;
		System.out.println("Addition of a and b:"+c);
	}
	public void subtraction()
	{
		c=a-b;
		System.out.println("Subtraction of a and b:"+c);
	}
	public void division()
	{
		c=a/b;
		System.out.println("Division of a and b:"+c);
	}
	public void multiplication()
	{
		c=a*b;
		System.out.println("Multiplication of a and b:"+c);
	}

	public static void main(String[] args) 
	{
		MethodsExample1 m=new MethodsExample1();
		m.add();
		m.division();
		m.multiplication();
		m.subtraction();

	}

}
