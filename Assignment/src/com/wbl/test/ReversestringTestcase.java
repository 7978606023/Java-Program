 package com.wbl.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.imp.ReverseString;

public class ReversestringTestcase {

	ReverseString res;
	
	@Test
	public void test1() {
		String str = "whitebox";
		res = new ReverseString();
		String result = res.reverseStr(str);
		Assert.assertEquals(result, "xobetihw");
	}
	
	@Test
	public void test2() {
		String str = "innovapath";
		String result = res.reverseStr(str);
		Assert.assertEquals(result, "htghhdkdlc");
	}
	
	
}