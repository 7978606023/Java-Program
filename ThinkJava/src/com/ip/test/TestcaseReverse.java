package com.ip.test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.exercise.Reverse;

public class TestcaseReverse {

	@Test
	public void test1() {
		String str = "whitebox";
		//String s = "xobetihw";
		String result = Reverse.rev(str);
		Assert.assertEquals(result, "xobetihw");
	}
}
