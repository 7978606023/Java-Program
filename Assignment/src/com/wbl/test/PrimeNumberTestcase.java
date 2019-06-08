package com.wbl.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.imp.PrimeNumber;

public class PrimeNumberTestcase {
	PrimeNumber pn;
	
	@Test
	public void testPrimeNumber(){
		int num = 7;
		pn=new PrimeNumber();
		String b=pn.primeNum(num);
		Assert.assertEquals(b, "Prime number");
		
	}
	
	@Test
	public void testNotPrimeNumber() {
		int num = 4;
		pn=new PrimeNumber();
		String b=pn.primeNum(num);
		Assert.assertEquals(b, "Not Prime number");
	}
	
	@Test
	public void testUnitNumber(){
		int num = 1;
		String b=pn.primeNum(num);
		Assert.assertEquals(b, "Not Prime number");
		
	}
	
	@Test
	public void testWithZero() {
		int num = 0;
		String b=pn.primeNum(num);
		Assert.assertEquals(b, "Not Prime number");
	}

	@Test
	public void testMinusNumber() {
		int num = -7;
		String b=pn.primeNum(num);
		Assert.assertNotEquals(b, "Not Prime number");
	}
	
	

}
