package com.imp;

public class ReverseString {

	public String reverseStr(String str) {
		
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			
			rev = rev+str.charAt(i);
		}
		return rev;
	}
}