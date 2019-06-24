package com.ip.imp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Missing {
	public static void main(String[] args) {
		int[] arr1= {2,3,4,5,4,5,3};
		int[] arr2= {2,3,4};
		List result= missing(arr1,arr2);
		System.out.println(result);
	}
	public static List missing(int[] first, int[] second) {
		HashSet nSet = new HashSet();
        
        for (int element : second) {
        	nSet.add(element);
        }
        
        
  
        List  missingNumbers = new ArrayList();
        
       
        for (int element : first) {
            
        	
        	boolean isPresent = nSet.add(element);
        	
      
        
        	if (isPresent) {
            	
            	missingNumbers.add(element);	                
            }
        }
        
        
	return missingNumbers;
	}
}
