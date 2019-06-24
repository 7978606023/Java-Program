package com.ip.imp;

public class StringContainNumber {

	 public static boolean checkNumbers(String str) {
		 if(str.isEmpty() || str == null)
			 return false;
		 
	        for (int i = 0; i < str.length(); i++) {
	            if ("1234567890".contains(Character.valueOf(str.charAt(i)).toString())) {
	                continue;
	            } else {
	                return false;
	            }
	        }
	        return true;
	    }
	}

