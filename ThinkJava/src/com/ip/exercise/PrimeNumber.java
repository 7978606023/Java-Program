package com.ip.exercise;

public class PrimeNumber {
	public static  String primeNum(int num) {
		int count = 0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				count++;
			}
			
		}
		if(count == 2) {
			return "Prime number";	
		}
		else{
			return "Not Prime number";
		}
	}

}
