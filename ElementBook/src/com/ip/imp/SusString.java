package com.ip.imp;

public class SusString {
	public static int subStringIndex(String str, String substr) {
	    int substrlen = substr.length();
	    int strlen = str.length();
	    int j = 0;
	    int index = -1;

	    if (substrlen < 1) {
	        return index;
	    }
	    else {
	        for (int i = 0; i < strlen; i++) {              // iterate through main string
	            if (str.charAt(i) == substr.charAt(j)) {    // check substring
	                index = i - j;                              // remember index
	                j++;                                    // iterate
	                if (j == substrlen) {                   // when to stop
	                    return index;
	                }
	            }
	            else {
	                j = 0;
	                index = -1;
	            }
	        }
	    }
	    return index;
	}

	
}
