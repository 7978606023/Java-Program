package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.exercise.RemoveDuplicateString;

public class TestRenoveDuplicate {
	
	@Test
	public void test() {
		String str = "hello";
		String result = RemoveDuplicateString.removeDup(str);
		Assert.assertEquals(result,"helo");
	}
}
