package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.imp.StringContainNumber;

public class TestStringContainNumber {

	@Test
	public void test1() {
		String str = "hello22";
		boolean result = StringContainNumber.checkNumbers(str);
		System.out.println(result);
		Assert.assertEquals(result, true);
	}
	
	//@Test
	public void test2() {
		String str = "565622";
		boolean result = StringContainNumber.checkNumbers(str);
		Assert.assertEquals(result, true);
	}
	
	//@Test
	public void test3() {
		String str = "";
		boolean result = StringContainNumber.checkNumbers(str);
		Assert.assertEquals(result,false);
	}
	
	//@Test
	public void test4() {
		String str = "hello";
		boolean result = StringContainNumber.checkNumbers(str);
		Assert.assertEquals(result,false);
	}
	
	
}
