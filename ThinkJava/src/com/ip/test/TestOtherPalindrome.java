package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.exercise.OtherPalindrome;

public class TestOtherPalindrome {

	@Test
	public void test1() {
		String a = "keep";
		boolean result = OtherPalindrome.palin(a);
		Assert.assertEquals(result, false);
	}
	@Test
	public void test2() {
		String a = "keep";
		boolean result = OtherPalindrome.palin(a);
		Assert.assertEquals(result, false);
	}
}
