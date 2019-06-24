package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.exercise.Palindrome;

public class TestCasePalindrome {

	@Test
	public void test1() {
		String s = "otto";
		String result = Palindrome.palindrome(s);
		Assert.assertEquals(result, "palindrome");
	}
	
	@Test
	public void test2() {
		String s = "whitebox";
		String result = Palindrome.palindrome(s);
		Assert.assertEquals(result, "not palindrome");
	}
}
