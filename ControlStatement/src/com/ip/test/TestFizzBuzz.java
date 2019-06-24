package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.logic.BizzFuzz;

public class TestFizzBuzz {

	@Test
	public void test1() {
		int num = 10;
		String result = BizzFuzz.findFizzBuzz(num);
		Assert.assertEquals(result,"Fizz");
	}
	
	@Test
	public void test2() {
		int num = 30;
		String result = BizzFuzz.findFizzBuzz(num);
		Assert.assertEquals(result, "FizzBuzz");
	}
	
	@Test
	public void test3() {
		int num = 2;
		String result = BizzFuzz.findFizzBuzz(num);
		Assert.assertEquals(result, "false");
	}
}
