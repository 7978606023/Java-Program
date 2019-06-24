package com.ip.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ip.exercise.Square;

public class TestSqaure {
 
	@Test
	public void Test1() {
		double[] a= {1,2,3,4};
		double[] b= {1,4,9,16};
		double[] result=Square.powArray(a);
		Assert.assertEquals(result,b);
		}
	}

