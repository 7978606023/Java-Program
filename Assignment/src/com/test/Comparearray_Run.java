package com.test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imp.CompareArray;

public class Comparearray_Run {
	CompareArray ca;
	
	@Test
	public void test1() {
		
		ca = new CompareArray();
		int[] arr1 = { 1, 2, 3, 4, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 4, 5};
		
		boolean reuslt = ca.isTwoArrayEqual(arr1, arr2);
		Assert.assertTrue(reuslt);
	}
}