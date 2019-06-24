package com.ip.imp;

public class Secondlargest {
public static int secondLarge(int[] arr) {
	int large=arr[0];
	int secondlarge=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]> large){
			secondlarge=large;
			large=arr[i];
		}
		else if(arr[i]>secondlarge) {
			secondlarge=arr[i];
		}
	}
	return secondlarge;
}
}
