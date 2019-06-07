package com.wbl.imp;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray{
	
	public void removeDup(int []arr) {
		int count = 0;
	
		Set hs = new HashSet();
		
		for(int i=0;i<arr.length;i++) {
			if(hs.add(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}
}