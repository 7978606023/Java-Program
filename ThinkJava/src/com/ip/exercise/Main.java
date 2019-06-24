package com.ip.exercise;

public class Main {
	public static char first(String s) {
		return s.charAt(0);
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
		System.out.println(first("hello"));
		System.out.println(rest("hello"));
		System.out.println(middle("hello"));
		System.out.println(length("hello"));

	}

}
