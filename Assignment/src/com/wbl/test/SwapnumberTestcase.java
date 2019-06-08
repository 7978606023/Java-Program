package com.wbl.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.imp.SwapNumber;

public class SwapnumberTestcase {
	SwapNumber sn;
	
	@Test
	public void testSwapNumber() {
		int a=10;
		int b=20;
		sn=new SwapNumber();
		int result[] = sn.swap(a,b);
		assertEquals(result[0],10);
		assertEquals(result[1],20);
		
	}
	
	@Test
	public void testSwapWithZero() {
		int a=0;
		int b=30;
		int result[] = sn.swap(a,b);
		assertEquals(result[0],0);
		assertEquals(result[1],30);
		
	}
	
	@Test
	public void testSwapMinusNumber() {
		int a=0;
		int b=-6;
		
		int result[] = sn.swap(a, b);
		Assert.assertEquals(result[0],0);
		Assert.assertEquals(result[1],-6);
	}
	
	@Test
	public void testSwapNum() {
		int a=100;
		int b=103;
		sn=new SwapNumber();
		int result[] = sn.swap(a,b);
		assertEquals(result[0],100);
		assertEquals(result[1],103);
	}
	
	@Test
	public void testSwapNum1() {
		int a=4888;
		int b=8787;
		sn=new SwapNumber();
		int result[] = sn.swap(a,b);
		assertEquals(result[0],4888);
		assertEquals(result[1],8787);
		}
}