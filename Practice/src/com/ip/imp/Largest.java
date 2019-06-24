package com.ip.imp;


public class Largest {
	public static int[] largest(int[] arr) {
		int max=arr[0];
		int min=arr[0];
		
		int [] temp = new int[2];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
		 		max=arr[i];
		   
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
	    temp[0] = max;
	    temp[1] = min;
	
	    return temp;
	}

}
