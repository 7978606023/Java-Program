package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.imp.Secondlargest;

public class TestSecondLarge {

	@Test
	public void test1() {
		int[] arr= {2,4,5};
		int result=Secondlargest.secondLarge(arr);
		Assert.assertEquals(result, 4);
	}
}
