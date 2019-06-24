package com.wbl.logic;

public class ReverseNumber {
public static int reverseNum(int num) {
	int rev=0;
	while(num !=0){
		  rev = rev * 10;
          rev = rev + num%10;
          num = num/10;
	}
	return rev;
}
	
}

