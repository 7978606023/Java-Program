package com.wbl.imp;

public class CompareArray {
public boolean isTwoArrayEqual(int []arr1, int []arr2) {
		
		boolean isArrayEqual = true;

		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] != arr1[i]) {
			isArrayEqual = false;
				}
			}
		} 
		else {
			isArrayEqual = false;
		}
		System.out.println(isArrayEqual);
		return isArrayEqual;
		
	}
}