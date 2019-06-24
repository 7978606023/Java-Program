package com.ip.logic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNonRepeat {

	@Test
	public void test1() {
		String str = "hhello";
		char result = NonRepeat.firstNonrepeat(str);
		Assert.assertEquals(result,'e');
	}
}
