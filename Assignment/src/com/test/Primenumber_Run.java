package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imp.PrimeNumber;

public class Primenumber_Run {
	PrimeNumber pim;
	
	@Test
	public void test1(){
		int num = 7;
		pim=new PrimeNumber();
		String b=pim.primeNum(num);
		  Assert.assertEquals(b, "Prime number");
		
	}

}
