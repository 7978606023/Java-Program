package com.wbl.imp;

public class SwapNumber {
	public int[] swap(int a,int b) {
		
		 int[] arr=new int[2];
		    a = a + b;
		    b = a - b; 
		    a = a - b;
		    arr[0]=b;
		    arr[1]=a;
		    
		    return arr;
		   
		    
	}
}
