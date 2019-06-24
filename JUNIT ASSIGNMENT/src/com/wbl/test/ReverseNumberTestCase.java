package com.wbl.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.wbl.logic.ReverseNumber;

public class ReverseNumberTestCase {
	
	@Test
	public void test1() {
		int num=564;
		int result=ReverseNumber.reverseNum(num);
		Assert.assertEquals(result, 465);
	}

	@Test
	public void test2() {
		int num=053;
		int result=ReverseNumber.reverseNum(num);
		Assert.assertEquals(result, 350);
	}
	
	@Test
	public void test3() {
		int num=503;
		int result=ReverseNumber.reverseNum(num);
		Assert.assertEquals(result, 305);
	}
	
	//@Test
	public void test4() {
		int num=350;
		int result=ReverseNumber.reverseNum(num);
		Assert.assertEquals(result, 053);
	}
}
