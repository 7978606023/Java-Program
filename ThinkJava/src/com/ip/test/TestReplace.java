package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.exercise.Replace;

public class TestReplace {

	@Test
	public void test1() {
		String original = "hello anubhav";
		String a = "hello";
		String b = "bye" ;
		String result = Replace.replace(original, a, b);
		Assert.assertEquals(result, "bye anubhav");
	}
}
