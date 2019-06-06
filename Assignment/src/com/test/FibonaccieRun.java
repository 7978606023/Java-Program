package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imp.Fibonaccie;

public class FibonaccieRun {
	Fibonaccie fib;
	
	@Test
	public void test1(){
		fib=new Fibonaccie();
		int actual=fib.fibonaccienum(5);
		Assert.assertEquals(actual, 8);
		
		
	}

}
