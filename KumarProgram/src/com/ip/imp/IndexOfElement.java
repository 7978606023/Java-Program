package com.ip.imp;

public class IndexOfElement {
	
	 public static boolean findIndex(int arr[], int t) 
	    { 
	 
	        if (arr == null) { 
	            return false; 
	        } 
	  
	        int len = arr.length; 
	        int i = 0; 
	   
	        while (i < len) {
	            if (arr[i] == t) { 
	                return true; 
	            } 
	            
	        } 
	        return false; 
	    } 
}
