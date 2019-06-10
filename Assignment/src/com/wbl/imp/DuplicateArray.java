package com.wbl.imp;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray{
	
	public static int[] removeDup(int[] arr) {

		int count = 0;

		Set st = new HashSet();
		
		int []temp = new int[arr.length];
		
		if (arr.length == 0) {
			System.out.println("We can't perform removal operation of duplicates elements");
		} 
		else {
			for (int i = 0; i < arr.length; i++) {
				if (st.add(arr[i])) {
					temp[count] = arr[i];
					count++;
				}
			}
		}
		return temp;
	}
}
