package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.exercise.ReverseRecursion;

public class TestReverseRecursion {

	@Test
	public void test1() {
		String str = "hello";
		String result = ReverseRecursion.revRecursion(str);
		Assert.assertEquals(result, "olleh");
	}
	
	@Test
	public void test2() {
		String str = "he llo";
		String result = ReverseRecursion.revRecursion(str);
		Assert.assertEquals(result, "oll eh");
				
	}
	@Test
	public void test3() {
		String str = "he llo anub hav";
		String result = ReverseRecursion.revRecursion(str);
		Assert.assertEquals(result, "vah buna oll eh");
	}
	
	@Test
	public void test4() {
		String str = "123456";
		String result = ReverseRecursion.revRecursion(str);
		Assert.assertEquals(result, "654321");
	}
	
	@Test
	public void test5() {
		String str = "-1,-3,-6,-7,-9";
		String result = ReverseRecursion.revRecursion(str);
		Assert.assertEquals(result, "9-,7-,6-,3-,1-");
	}
	
	@Test
	public void test6() {
		String str = " ";
		String result = ReverseRecursion.revRecursion(str);
		Assert.assertEquals(result, " ");
	}
	@Test
	public void test7() {
		String str = "";
		String result = ReverseRecursion.revRecursion(str);
		Assert.assertEquals(result, "");
	}
}
