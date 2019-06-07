package com.wbl.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.imp.ReverseNumber;

public class ReverseNumberTestcase {
	ReverseNumber revnum;
	
	@Test
	public void test1() {
		
		int num=123;
		revnum=new ReverseNumber();
		int result=revnum.Reversenum(num);
		Assert.assertEquals(result,321);
	}
	
	@Test
	public void test2() {
		
		int num=564;
		int result=revnum.Reversenum(num);
		Assert.assertEquals(result,465);
	}
}
