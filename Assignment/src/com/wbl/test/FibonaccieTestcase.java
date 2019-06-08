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
		Assert.assertEquals(actual,34);
		
	}
	
	@Test
	public void test2(){
		fib=new Fibonaccie();
		int actual=fib.fibonaccienum(0);
		Assert.assertNotEquals(actual, 0);
		
	}
	
	@Test
	public void test3(){
		fib=new Fibonaccie();
		int actual=fib.fibonaccienum(1);
		Assert.assertNotEquals(actual, 1);
		
	}
	

}
