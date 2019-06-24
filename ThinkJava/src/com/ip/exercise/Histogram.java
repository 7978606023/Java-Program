package com.ip.exercise;

public class Histogram {
	public void printHistogram(int[] a) {
	     for (int i = 0; i < a.length; i++) {
	        String label = i + " : ";
	        System.out.println(label + convertToStars(a[i]));
	    }
	}

	public String convertToStars(int num) {
	    StringBuilder builder = new StringBuilder();
	    for (int j = 0; j < num; j++) {
	        builder.append('*');
	    }
	    return builder.toString();
	}
}

