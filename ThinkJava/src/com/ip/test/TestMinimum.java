package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.exercise.MinRange;

public class TestMinimum {

	@Test
	public void test1() {
		int[] a= {2,4,1};
		int result=MinRange.areMin(a);
		Assert.assertEquals(result, 1);
	}
	
	@Test
	public void test2() {
		int[] a= {-3,-1,-4};
		int result=MinRange.areMin(a);
		Assert.assertEquals(result, -4);
	}
}
