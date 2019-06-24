package com.ip.exercise;

public class Vowels {
public static int vowel(String str) {
	int count = 0;
	String s = str.toLowerCase();
	for(int i = 0;i<s.length();i++) {
		if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
			count++;
		}
	}
	return count;
}
}
