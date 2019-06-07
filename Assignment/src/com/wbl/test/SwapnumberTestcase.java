package com.wbl.test;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import com.wbl.imp.SwapNumber;

public class SwapnumberTestcase {
	SwapNumber sn;
	
	@Test
	public void test1() {
		int a=10;
		int b=20;
		sn=new SwapNumber();
		int result[] = sn.swap(a,b);
		assertEquals(result[0],10);
		assertEquals(result[1],20);
	}
	
	@Test
	public void test2() {
		int a=20;
		int b=30;
		int result[] = sn.swap(a,b);
		assertEquals(result[0],30);
		assertEquals(result[1],20);
	}
	}

