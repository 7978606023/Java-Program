package com.wbl.imp;

public class SwapNumber {
	public int[] swap(int a,int b) {
		
		 int[] arr=new int[2];
		    a = a + b;      // -5       -2   3
		    b = a - b;      //-5-3=--8
		    a = a - b;      //-5--8=-3
		    arr[0]=b;
		    arr[1]=a;
		    
		    return arr;
		   
		    
	}
}
