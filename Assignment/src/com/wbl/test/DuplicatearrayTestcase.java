package com.wbl.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.imp.DuplicateArray;

public class DuplicatearrayTestcase {

public class TestCaseRemoveDuplicates {
	DuplicateArray da;

	@Test
	public void test1() {
		int []arr = {10,20,20,30,30,40,50,50};
		da = new DuplicateArray();
		da.removeDup(arr);
	}
	
	/*@Test
	public void test2() {
		int []arr = {8,3,4,6,8,4,6,3};
		RemoveDuplicate.removeDup(arr);
	}*/
    }
}
