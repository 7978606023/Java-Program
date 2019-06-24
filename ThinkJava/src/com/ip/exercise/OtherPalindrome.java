package com.ip.exercise;

public class OtherPalindrome {
public static boolean palin(String a) {
	for(int i = 0, j = a.length()-1;i<j;i++,j--) {
		if(a.charAt(i) != a.charAt(j))
			return false;
	}

return true;
}
}
