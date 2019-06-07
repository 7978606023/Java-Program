package com.wbl.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.imp.Fibonaccie;

public class FibonaccieTestcase {
	Fibonaccie fib;
	
	@Test
	public void test1(){
		fib=new Fibonaccie();
		int actual=fib.fibonaccienum(5);
		Assert.assertEquals(actual, 7);
		
	}
		
	@Test
	public void test2(){
		fib=new Fibonaccie();
		int actual=fib.fibonaccienum(3);
		Assert.assertEquals(actual, 4);
		
	}

}
