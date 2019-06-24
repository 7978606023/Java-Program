package com.ip.exercise;

public class Puzzler {

	public static void main(String[] args) {
		char x = 'b';
		x=x+1;  //error: incompatible types: possible lossy conversion from int to char
		System.out.println(x);

	}

}
