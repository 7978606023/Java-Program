package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.imp.Miss;

public class TestMiss {

	@Test
	public void test1() {
		int[] arr = {1,2,3,4,6};
		int result=Miss.missingNumber(arr);
		Assert.assertEquals(result, 5);
	}
}
