package com;
import java.util.Scanner;

public class Primnogivenrangss {

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the your Prime number range: ");
			long num = sc.nextLong();
			int count=2;
			int i,j;
			if(num==2)
				count=1;
			else if(num==3)
				count =2;
			
			for(i=4;i<=num;i++)
			{
				for(j=2;j<=i;j++)
				{
				    if(i == j)
				    	count++;
				    else if(i%j == 0)
				    	break;   		    	
				}
}
}
}