package com.ip.test;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ip.logic.ArrayReplace;

public class ReplaceTestCase {
	
	@Test
	public void test1() {
		
	int[] arr = { 1, 2, 3, 4, 5 };
	int findElement = 4;
	int replaceElement = 10;
	int[] expected = ArrayReplace.arrayReplace(arr, findElement, replaceElement);
	int[] actual = { 1, 2, 3, 10, 5 };
	Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void test2() {
		
	int[] arr = { 1, 2, 3, 4, 5 };
	int findElement = 2;
	int replaceElement = 0;
	int[] expected = ArrayReplace.arrayReplace(arr, findElement, replaceElement);
	int[] actual = { 1, 0, 3, 4, 5 };
	Assert.assertEquals(actual, expected);
	}

}
