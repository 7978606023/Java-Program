package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.exercise.StringNoOfWord;

public class TestStringNoOfWord {

	@Test
	public void test() {
		String str = "helloanubhav";
		int result = StringNoOfWord.numberOfWord(str);
		Assert.assertEquals(result, 2);
	}
}
