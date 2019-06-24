package com.ip.exercise;

public class RemoveDuplicateString {

	public static String removeDup(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			if (!res.contains(String.valueOf(str.charAt(i)))) {
				res += String.valueOf(str.charAt(i));
			}
		}
		return res;
	}
}