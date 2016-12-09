package com;

import java.util.Scanner;

public class Reversedigintegerss {
	public static void main(String args[])
	{
	   int n, reverse = 0;

	   System.out.println("Enter the number to reverse");
	   Scanner scn = new Scanner(System.in);
	   n = scn.nextInt();

	   while( n!= 0 )
	   {
	       reverse = reverse * 10;
	       reverse = reverse + n%10;
	       n = n/10;
	   }

	   System.out.println("Reverse of entered number is "+reverse);
	}
}
