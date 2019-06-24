package com.wbl.imp;

public class ReverseNumber {
	public int reverseNum(int num) {
		int rev=0;
		 while(num != 0) {
	          rev = rev * 10;
	          rev = rev + num%10;
	          num = num/10;
	      }
		return rev;
	}

}
