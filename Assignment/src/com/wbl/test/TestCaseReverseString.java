package com.wbl.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.imp.ReverseString;

public class TestCaseReverseString {

	ReverseString rev;
	
	@Test
	public void test1() {
		
		String str = "whitebox";
		rev = new ReverseString();
		String result = rev.revStrig(str);
		Assert.assertEquals(result, "xobetihw");
	}
	
	@Test
	public void test2() {
		
		String str = "-whitebox";
		rev = new ReverseString();
		String result = rev.revStrig(str);
		Assert.assertEquals(result, "xobetihw-");
	}
	
	@Test
	public void test3() {
		
		String str = "whit ebox";
		rev = new ReverseString();
		String result = rev.revStrig(str);
		Assert.assertEquals(result, "xobe tihw");
	}
	
	@Test
	public void test4() {
		
		String str = "";
		rev = new ReverseString();
		String result = rev.revStrig(str);
		Assert.assertEquals(result, "");
	}
}
