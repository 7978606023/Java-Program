package com.wbl.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.wbl.imp.FactorialNumber;

public class FactorialTestcase {
	FactorialNumber fac;
	 
		  @Test
		    public void test1() {
		         fac = new FactorialNumber();
		      int result=fac.factorial(5);
		     
		        assertEquals(result,120);
		    }
}


