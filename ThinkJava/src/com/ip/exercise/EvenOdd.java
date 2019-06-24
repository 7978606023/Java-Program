package com.ip.exercise;

public class EvenOdd {
public static boolean areOddEven(int[] a) {
	boolean even=true;
	
	for(int i=0;i<a.length;i++) {
		if(a[i]%2!=0) {
			return false;
		}
		else {
			if(a[i]%2==0) {
				return true;
			}
		}
	}
	return even;
}
}
