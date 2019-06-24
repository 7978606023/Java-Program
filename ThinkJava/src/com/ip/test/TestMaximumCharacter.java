package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.exercise.MaximumCharacter;

public class TestMaximumCharacter {

	@Test
	public void test1() {
		String s ="geekforgeeks";
		char maxkey = 'e';
		char result = MaximumCharacter.maxvalue(s);
		Assert.assertEquals(result, 'g');
		
	}
}
