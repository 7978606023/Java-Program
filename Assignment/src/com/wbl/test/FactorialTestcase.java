package com.wbl.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

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
		  
		  @Test
		    public void test2() {
		         fac = new FactorialNumber();
		      int result=fac.factorial(0);
		     
		        assertNotEquals(result,0);
		    }
		  
		  @Test
		    public void test3() {
		         fac = new FactorialNumber();
		      int result=fac.factorial(1);
		     
		        assertEquals(result,1);
		    }
		  
		  @Test
		    public void test4() {
		         fac = new FactorialNumber();
		      int result=fac.factorial(7);
		     
		        assertEquals(result,5040);
		    }
}


