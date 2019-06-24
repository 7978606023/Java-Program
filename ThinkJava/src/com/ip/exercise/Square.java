package com.ip.exercise;

public class Square {
public static double[] powArray(double[] a) {
	for(int i=0;i<a.length;i++) {
		a[i]=(double) Math.pow(a[i], 2);
	}
	for(double value : a) {
		System.out.println(value);
	}
	return a;
	
}
}
