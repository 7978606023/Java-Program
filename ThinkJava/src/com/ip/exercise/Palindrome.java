package com.ip.exercise;

public class Palindrome {

	public static String palindrome(String s) {
		String rev = "";
		for (int i = s.length()-1 ;i >= 0;i--) {
			rev = rev + s.charAt(i);
		}
		if (s.equals(rev)) 
			return "palindrome";
		else
			return "not palindrome";
			
		

	}
}