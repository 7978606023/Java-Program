package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.exercise.LargestElement;

public class TestLargestElement {

	@Test
	public void test1() {
		int a[]= {2,3,4};
		int result=LargestElement.indexOfArray(a);
		Assert.assertEquals(result, 4);
	}
}
