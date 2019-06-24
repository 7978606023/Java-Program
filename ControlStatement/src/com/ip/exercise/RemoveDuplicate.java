package com.ip.exercise;

public class RemoveDuplicate {
	
	public static String removeDup(String str) {
		String res = " ";
		for(int i=0;i<str.length();i++) {
			if(!res.contains(String.valueOf(str.charAt(i)))) {
				res += String.valueOf(str.charAt(i));
			}
			//System.out.println(res);
		}
		return res;
		
	}

	public static void main(String[] args) {
		String s= "hellooo";
		System.out.println(removeDup(s));

	}

}
