package com.wbl.imp;

public class LargestArray {
	public static int largest(int[] list) {

		int  max = list[0];
		for (int i = 0; i < list.length; i++) {

			if (list[i] > max) {
				max = list[i];
			}
		}
		return max;

	}
}
