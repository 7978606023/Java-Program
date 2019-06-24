package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.exercise.Vowels;

public class TestVowels {

	@Test
	public void test1() {
		String str ="hello";
		int result = Vowels.vowel(str);
		Assert.assertEquals(result, 2);
		
	}
	
	@Test
	public void test2() {
		String str = "aeiou";
		int result = Vowels.vowel(str);
		Assert.assertEquals(result, 5);
	}
}
