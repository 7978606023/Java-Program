package com.ip.logic;

public class ArrayReplace {
	public static int[] arrayReplace(int[] arr, int findElement, int replaceElement) {


			for (int i = 0; i < arr.length; i++) {

				if (arr[i] == findElement) {
					arr[i] = replaceElement;
				}
			}
		return arr;
	}

}
