package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.imp.RomanToDecimal;

public class TestRomanToDecimal {

	@Test
	public void test1() {
		String roman = "xl";
		int result = RomanToDecimal.romanConvert(roman);
		Assert.assertEquals(result, 10);
	}
}
