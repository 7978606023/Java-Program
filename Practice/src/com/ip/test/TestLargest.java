package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.imp.Largest;

public class TestLargest {

	@Test
	public void test1() {
		int[] arr = {2,4,5,6};
		int[] expected = {6,2};
		int [] actual =  Largest.largest(arr);
		Assert.assertEquals(actual, expected);
	}
}
