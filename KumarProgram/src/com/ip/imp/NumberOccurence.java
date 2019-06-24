package com.ip.imp;

public class NumberOccurence {

	public static int getOccurrences(int[] numbers)
	{
	    int count = 0;

	    for (int i = 0; i < numbers.length; i++)
	    {
	        int currentInt = numbers[i];;

	        if (currentInt == numbers[i])
	        {
	            count++;
	        }
	    }

	    return count;
	}
}
