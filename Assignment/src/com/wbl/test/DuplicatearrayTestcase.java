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
	
	@Test
	public void test2() {
		int []arr = {30,20,0,30,30,40,0,40};
		da = new DuplicateArray();
		da.removeDup(arr);
	}
	
	@Test
	public void test3() {
		int []arr = {0,-1,3,-5,-1,-3,5,6,5};
		da = new DuplicateArray();
		da.removeDup(arr);
	}
	
	@Test
	public void test4() {
		int []arr = {12,3,4,4,3,45,66,7,5,3,};
		da = new DuplicateArray();
		da.removeDup(arr);
	}
	

    }
}
