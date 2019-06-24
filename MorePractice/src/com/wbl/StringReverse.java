package com.wbl;

public class StringReverse {
	public static void stringRev(String s) {
		String rev = "";
		int len = s.length();
		for(int i=len-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		
		String s = "hello";
		stringRev(s);

	}

}
