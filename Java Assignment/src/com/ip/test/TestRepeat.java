package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.logic.Repeating;

public class TestRepeat {

	//@Test
	public void test1() {
		int[] arr = {1,2,3,3};
		int length = arr.length;
		int result = Repeating.dupLastIndex(arr,length);
		Assert.assertEquals(result, 5);
	}
	
	//@Test
		public void test2() {
			int[] arr = {};
			int length = arr.length;
			Repeating.dupLastIndex(arr,length);
			
		}
	
	@Test
		public void test3() {
			int[] arr = {1,2,3,3,4,5,6,6};
			int length = arr.length;
			int result = Repeating.dupLastIndex(arr,length);
			Assert.assertEquals(result, 6);
		}
}
