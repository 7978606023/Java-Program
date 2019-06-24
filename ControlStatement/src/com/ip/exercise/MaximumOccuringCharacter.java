package com.ip.exercise;

public class MaximumOccuringCharacter {
	
	static final int ASCII_SIZE = 256;
	public static char maxOccur(String str) {
		
		int count[] = new int[ASCII_SIZE];
		int len = str.length();
		for(int i=0;i<len;i++) {
			count[str.charAt(i)]++;
			int max = -1;
			char res = ' ';
			for(int j=0;j<len;j++) {
				if(max<count[str.charAt(i)]) {
					max = count[str.charAt(i)];
					res = str.charAt(i);
					
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		

	}

}
