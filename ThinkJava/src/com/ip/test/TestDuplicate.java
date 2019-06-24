package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.exercise.Duplicate;

public class TestDuplicate {

	@Test
	public void test1() {
		String str = "helvvpp";
		char[] expected = {'v','p'};
		 char[] actual =  Duplicate.duplicate(str);
		 Assert.assertEquals(actual, expected);
		
	}
}
