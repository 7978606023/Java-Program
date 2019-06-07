package com.wbl.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.imp.PrimeNumber;

public class PrimeNumberTestcase {
	PrimeNumber pn;
	
	@Test
	public void test1(){
		int num = 7;
		pn=new PrimeNumber();
		String b=pn.primeNum(num);
		Assert.assertEquals(b, "Prime number");
		
	}
	
	@Test
	public void test2(){
		int num = 1;
		String b=pn.primeNum(num);
		Assert.assertEquals(b, "Prime number");
		
	}


}
