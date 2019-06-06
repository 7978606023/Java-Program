package com.test;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.testng.annotations.Test;

import com.imp.Duplicate_Array;

public class Duplicatearray_Run {
	@Test
    public void test() {
		Duplicate_Array rd;
        rd = new Duplicate_Array();

        String[] strArray = {"car","bus","bus","car","bike","van","bike","truck"};
        rd.removeDups(strArray);

        assertEquals(Arrays.asList("car","bus","bike"),strArray.toString());
    }
}