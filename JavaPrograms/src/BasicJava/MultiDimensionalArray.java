package com.BasicJava;

public class MultiDimensionalArray 
{

	public static void main(String[] args) 
	{
		String a[][]=new String[3][3];
		a[0][0]="RAM";
		a[0][1]="RAJ";
		a[0][2]="RAMESH";
		a[1][0]="PAVAN";
		a[1][1]="PASHA";
		a[1][2]="PRADEEP";
		a[2][0]="SANTOSH";
		a[2][1]="SANDY";
		a[2][2]="SUMAN";
		
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<=2; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
				

	}

}
