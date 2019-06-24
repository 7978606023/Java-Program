package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.exercise.MaxOccurValue;

public class TestmaxOccur {

	@Test
	public void test1() {
		String str = "hello";
		char result = MaxOccurValue.maxOccur(str);
		Assert.assertEquals(result, 'h');
	}
}
