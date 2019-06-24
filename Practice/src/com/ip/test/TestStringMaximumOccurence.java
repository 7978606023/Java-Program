package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.imp.StringMaximumOccurence;

public class TestStringMaximumOccurence {

	@Test
	public void test1() {
		String str = "hello";
		char result1 = StringMaximumOccurence.getMaxOccuringChar(str);
		Assert.assertEquals(result1, 'l');
	}
	
	@Test
	public void test2() {
		String str = "llkkkppp";
		char result1 = StringMaximumOccurence.getMaxOccuringChar(str);
		Assert.assertEquals(result1, 'k');
	}
}
