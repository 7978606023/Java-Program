package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.exercise.EvenOdd;

public class TestEven {

	@Test
	public void test1() {
		int[] a= {5,3,7};
		boolean result=EvenOdd.areOddEven(a);
		Assert.assertEquals(result,true);
	}
}
