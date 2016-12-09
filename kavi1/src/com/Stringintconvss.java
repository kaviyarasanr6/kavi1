package com;

import java.util.Scanner;

public class Stringintconvss {
	public static void main(String args[]){
		int intoInt;
		String s;
		Scanner scn=new Scanner(System.in);
		s=scn.next();
		intoInt=Integer.parseInt(s);
		System.out.println("This is an integer: "+intoInt);
		}
}
