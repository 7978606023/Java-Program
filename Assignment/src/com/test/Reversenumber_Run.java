package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imp.ReverseNumber;
import com.imp.ReverseString;

public class Reversenumber_Run {
	ReverseNumber revnum;
	
	@Test
	public void test1() {
	int num=123;
	revnum=new ReverseNumber();
	int result=revnum.Reversenum(num);
	Assert.assertEquals(result,321);
	}
}
