package com.ip.logic;

public class FindLargestNum {
public static int findLarge(int[] a) {
	int max=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	return max;
}
}