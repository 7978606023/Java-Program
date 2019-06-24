package com.ip.imp;

public class Palindrome {

	public static boolean palindrome(String str) {

		if (str == null || str.isEmpty()) {
			return false;
		}
		
		int len = str.length() - 1;

		for (int i = 0; i <= len/2; i++) {
			if(str.charAt(i) != str.charAt(len - i)) {
				return false;
			}		
		}
		
		return true;

	}
}