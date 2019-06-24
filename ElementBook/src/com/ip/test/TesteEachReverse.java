package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.imp.EachReverse;

public class TesteEachReverse {

	@Test
	public void test1() {
		String str = "hello anubhav";
		String result = EachReverse.reverseWord(str);
		Assert.assertEquals(result, "olleh vahbuna");
	}
}
