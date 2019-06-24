package com.ip.imp;

public class Replace {
public static int[] replace(int[] a,int findElement,int replace) {
	for(int i=0;i<a.length;i++) {
		if(a[i]==findElement) {
		a[i]=replace;
		}
	}
	return a;
}
}
