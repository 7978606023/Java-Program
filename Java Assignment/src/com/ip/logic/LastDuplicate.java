package com.ip.logic;

//[1,1,2,3,4,5,5] - [1,2,2,3, 4], [1,2,3,3]

import java.util.HashSet;
import java.util.Set;

public class LastDuplicate {
public static int duplicate(int[] arr) { 
	
	int count = 0;
	Set h = new HashSet();
	int[] temp = new int[arr.length];
	if(arr.length == 0) {
		
		System.out.println("we cant perform");
	}
	else {
		for(int i=0;i<arr.length;i++) {
			if(h.add(arr[i])) {
				temp[count]=arr[i];
				count++;
			}
		}
	}
	return count;
}
}
