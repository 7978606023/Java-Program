package com.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.imp.Factorial;

public class Factorial_Run {
	Factorial fac;
	 
		  @Test
		    public void test1() {
		         fac = new Factorial();
		      int result=fac.fact(5);
		     
		        assertEquals(result,120);
		    }
}


