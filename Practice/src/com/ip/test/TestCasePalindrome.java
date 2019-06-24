package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.imp.Palindrome;

public class TestCasePalindrome {

	@Test
	public void test1() {
		String str = "peek";
		boolean result = Palindrome.palindrome(str);
		Assert.assertEquals(result,false);
	}
	@Test
	public void test2() {
		String str = "madam";
		boolean result = Palindrome.palindrome(str);
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void test3() {
		String str = "";
		boolean result = Palindrome.palindrome(str);
		Assert.assertEquals(result, false);
	}
	

}
