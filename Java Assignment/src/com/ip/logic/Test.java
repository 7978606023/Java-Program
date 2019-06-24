package com.ip.logic;
//Simple practice 
public class Test {
static void dupLastIndex(int arr[],int n) {
	if(arr == null || n<=0)
		return;
		for(int i=n-1;i>0;i--) {
		if(arr[i]==arr[i-1]) {
			System.out.println(arr[i]);
			break;
		}
	}
}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,4,5,5};
		int n = arr.length;
		dupLastIndex(arr,n);

	}

}
