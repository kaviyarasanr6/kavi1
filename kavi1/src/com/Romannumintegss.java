package com;

public class Romannumintegss {
	public static String intToRoman(int num) {
	    StringBuilder sb = new StringBuilder();
	    int count = 0;
	    String[] roman = new String[] { "I", "II", "III","IV","V","VI","VI","VII","VIII","IX", "X", "XL", "L",
	            "XC", "C", "CD", "D", "CM", "M" };
	    int[] a = new int[] { 1,2,3,4,5,6,7,8, 9, 10 };
	    for (int i = a.length - 1; i >= 0; i--) {
	        count = num / a[i];
	        num %= a[i];
	        while (count > 0) {
	            sb.append(roman[i]);
	            count--;
	        }
	    }
	    return sb.toString();
	}
}
