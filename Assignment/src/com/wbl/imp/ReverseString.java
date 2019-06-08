package com.wbl.imp;

public class ReverseString {

	public String  revStrig(String str) {
		
		String rev = "";
		
		if(str.length() == 0) {
			System.out.println("Can't perform reverse operation");
		}
		else {
			for(int i=str.length()-1;i>=0;i--) {
				rev = rev+str.charAt(i);
			}
		}
		return rev;
	}
}