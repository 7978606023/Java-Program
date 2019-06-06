package com.test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imp.SwapNumber;

public class Swap_Run {
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
	
	}

