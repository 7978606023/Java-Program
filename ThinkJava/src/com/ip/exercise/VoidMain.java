package com.ip.exercise;

public class VoidMain {
	
	public static void first(String s) {
		char c = s.charAt(0);
		return  ;
	}

	public static String rest(String s) {
		return s.substring(1);
	}

	public static String middle(String s) {
		return s.substring(1, s.length() - 1);
	}

	public static int length(String s) {
		return s.length();
	}
	public static void main(String[] args) {
	
		first("hello");
	}

}
