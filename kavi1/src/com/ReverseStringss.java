package com;

import java.util.Scanner;

public class ReverseStringss {
	public static void main(String[] args) {
		String str = "";
		Scanner sc = new Scanner(System.in);
		  System.out.print("Enter a string");
		  String str1 = sc.next();
		  for(int i=str1.length()-1;i>=0;i--) {
			  str = str + str1.charAt(i);
		  }
		  System.out.println(str);
		
	}
}
