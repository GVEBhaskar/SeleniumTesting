package com.BasicJava;

public class NestedCondition 
{

	public static void main(String[] args) 
	{
		int a=20;
		int b=30;
		int c=40;
		if (a>b && a>c)
		{
			System.out.println("a is greater"+a);
		}	
		else
			if (b>c)
			{
				System.out.println("b is greater"+b);
			}
			else
			{
				System.out.println("c is greater" +" - "+c);
			}
	}

}
