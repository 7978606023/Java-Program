package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.exercise.RemoveDuplicate;

public class TestRemoveDuplicate {

	@Test
	public void test1() {
		String str = "hello";
		String result = RemoveDuplicate.removeDup(str);
		Assert.assertEquals(result, "helo");
	}
	
	@Test
	public void test2() {
		String str = "hello anubhav";
		String result = RemoveDuplicate.removeDup(str);
		Assert.assertEquals(result, "helo anubv");
	}
}
