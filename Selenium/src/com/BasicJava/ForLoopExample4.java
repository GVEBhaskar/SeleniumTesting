package com.BasicJava;

public class ForLoopExample4 {

	public static void main(String[] args) {
		for (int x=0; x<=3; x++)
		{
			for (int y=0; y<=x; y++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println("##################");
for (int i=0; i<=3; i++)
{
	for (int j=0; j<=i; j++)
	{
		System.out.print(i+" ");
	}
	System.out.println();
}System.out.println("##################");
	for (int x=3; x>=0; x--)
	{
		for (int y=0; y<=x; y++)
		{
			System.out.print(x+" ");
		}
		System.out.println();
			
	}
	}
	

}
