package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.exercise.Anagrams;

public class TestAnagram {

	@Test
	public void test1() {
		String a = "peek";
		String b = "keep";
		String result = Anagrams.anagram(a, b);
		Assert.assertEquals(result,"Anagram" );
	}
	
	@Test
	public void test2() {
		String a = "whitebox";
		String b = "boxwhite";
		String result = Anagrams.anagram(a, b);
		Assert.assertEquals(result,"Anagram" );
	}
	
	@Test
	public void test3() {
		String a = "peek";
		String b = "peek";
		String result = Anagrams.anagram(a, b);
		Assert.assertEquals(result,"Anagram" );
	}
	
	@Test
	public void test4() {
		String a = "peek";
		String b = "peak";
		String result = Anagrams.anagram(a, b);
		Assert.assertEquals(result,"Anagram" );
	}
	
}
