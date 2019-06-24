package com.ip.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void test() {
		int a=6;
		int b=5;
		int result=Add.add(a,b);
		Assert.assertNotEquals(result, 19);
		
	}

}
