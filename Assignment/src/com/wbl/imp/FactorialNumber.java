package com.wbl.imp;

public class FactorialNumber {
	  public int factorial(int number) {
	        int n= 1;
	       
	        for(int i=1;i<=number;i++){
	            n= n * i;
	            
	        }
	        return n;
	    }
}
