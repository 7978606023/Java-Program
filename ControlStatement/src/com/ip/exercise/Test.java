package com.ip.exercise;

class Test {
	String str;
	String rev = " ";

	for(int i = str.length() - 1;i>=0;i--)
	{
		rev = rev + str.charAt(i);
	}return rev;
}
}