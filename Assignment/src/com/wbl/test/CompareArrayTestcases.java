package com.wbl.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.imp.CompareArray;

public class CompareArrayTestcases {
	CompareArray compare;
	
	@Test
	public void test1() {
		
		compare = new CompareArray();
		int[] arr1 = { 1, 2, 3, 4, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 4, 5 };
		
		boolean result = compare.isTwoArrayEqual(arr1, arr2);
		Assert.assertTrue(result);
	}
	
	@Test
	public void test2() {
		
		int[] arr1 = {3, 4, 5, 6, 7, 8};
		int[] arr2 = {3, 4, 6, 7, 8, 9};
		
		boolean result = compare.isTwoArrayEqual(arr1, arr2);
		Assert.assertFalse(result);
	}
	
	@Test
	public void test3() {
		int[] arr1 = {-1, -3, 4, 7, 8, 6};
		int[] arr2 = {-1, -3, 4, 7, 8, 6};
		
		boolean result = compare.isTwoArrayEqual(arr1, arr2);
		Assert.assertTrue(result);
	}
	
	@Test
	public void test4() {
		int[] arr1 = {-2, 3, 4, 1, 2, 3};
		int[] arr2 = { 2, 3, 1, 9, 8, 7};
		
		boolean result = compare.isTwoArrayEqual(arr1, arr2);
		Assert.assertFalse(result);
	}
	
	@Test
	public void test5() {
		int[] arr1 = {0, 0, 0, 0, 0, 0};
		int[] arr2 = {0, 0, 0, 0, 0, 0};
		boolean result = compare.isTwoArrayEqual(arr1, arr2);
		Assert.assertTrue(result);
	}
}