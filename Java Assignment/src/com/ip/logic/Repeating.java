package com.ip.logic;

public class Repeating {
	public static int dupLastIndex(int arr[], int n) {

		int repeatElement = 0;

		if (arr == null || n <= 0) {
			throw new NullPointerException("can't perform repeated operation");
			
		} else {

			for (int i = n - 1; i > 0; i--) {
				if (arr[i] == arr[i - 1]) {
					
					repeatElement = arr[i];
					break;
				}
			}
		}

		return repeatElement;
	}
}
