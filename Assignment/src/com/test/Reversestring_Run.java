 package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imp.ReverseString;

public class Reversestring_Run {

	ReverseString res;
	
	@Test
	public void test1() {
		String str = "whitebox";
		res = new ReverseString();
		String result = res.reverseStr(str);
		
	    Assert.assertEquals(result, "xobetihw");
	}
	
	
}