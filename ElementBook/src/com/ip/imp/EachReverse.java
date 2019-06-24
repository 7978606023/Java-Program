package com.ip.imp;

public class EachReverse{
	public static String reverseWord(String str){  
		    String words[]=str.split(" ");  
		    String reverseWord="";  
		    for(String w:words){  
		        StringBuilder sb=new StringBuilder(w);  
		        sb.reverse();  
		        reverseWord+=sb.toString()+" ";  
		    }  
		    return reverseWord.trim();  
		}  
		 
}

