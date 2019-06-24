package com.wbl.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.imp.LargestArray;

public class ArrayTestCases {
	
	@Test
	public void test1() {
		int[] list= {7,8,9};
		int result=LargestArray.largest(list);
		Assert.assertEquals(result, 9);
	}
	
	@Test
	public void test2() {
		int result = 0;
		try {
		int[] list= {-7,-8,-9};
		result=LargestArray.largest(list);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		Assert.assertEquals(result, -7);
		
	}

}

