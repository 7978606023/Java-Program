package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.exercise.PrimeNumber;

public class PrimeNumberTest {
	@Test
	public void test1() {
		int num=-7;
		String result=PrimeNumber.primeNum(num);
		Assert.assertEquals(result,"Not Prime number");
	}

}
