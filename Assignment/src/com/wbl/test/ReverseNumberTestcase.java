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
		int result=revnum.reverseNum(num);
		Assert.assertEquals(result,321);
	}
	
	@Test
	public void test2() {
		
		int num=564;
		int result=revnum.reverseNum(num);
		Assert.assertEquals(result,465);
	}
	
	@Test
		public void test3() {
			
			int num=064;
			int result=revnum.reverseNum(num);
			Assert.assertNotEquals(result,460);
			
		}
	
	@Test
	public void test4() {
		
		int num=306;
		int result=revnum.reverseNum(num);
		Assert.assertEquals(result,603);
		
	}
	
	@Test
	public void test5() {
		
		int num=100;
		int result=revnum.reverseNum(num);
		Assert.assertEquals(result,001);
		
	}
	
	@Test
	public void test6() {
		
		int num=-386;
		int result=revnum.reverseNum(num);
		Assert.assertEquals(result,-683);
		
	}
	
}

