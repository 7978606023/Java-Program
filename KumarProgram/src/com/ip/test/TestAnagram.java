package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.imp.Anagram;

public class TestAnagram {

	@Test
	public void test1() {
		String str1 = "peek";
		String str2 = "keep";
		boolean result = Anagram.isAnagram(str1,str2);
		Assert.assertEquals(result,true);
	}

	@Test
	public void test2() {
		String str1 = "peek";
		String str2 = "kepp";
		boolean result = Anagram.isAnagram(str1,str2);
		Assert.assertEquals(result,false);
	}
	
	@Test
	public void test3() {
		String str1 = "";
		String str2 = "";
		boolean result = Anagram.isAnagram(str1,str2);
		Assert.assertEquals(result,false);
	}
	
	@Test
	public void test4() {
		String str1 = "peEK";
		String str2 = "keep";
		boolean result = Anagram.isAnagram(str1,str2);
		Assert.assertEquals(result,true);
	}
	
	@Test
	public void test5() {
		String str1 = "li ril";
		String str2 = "lrili";
		boolean result = Anagram.isAnagram(str1,str2);
		Assert.assertEquals(result,true);
	}
	
	@Test
	public void test6() {
		String str1 = "li ril";
		String str2 = "lr3li";
		boolean result = Anagram.isAnagram(str1,str2);
		Assert.assertEquals(result,false);
	}
	
}
