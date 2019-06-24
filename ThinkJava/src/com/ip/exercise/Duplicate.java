package com.ip.exercise;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {
	
public static char[] duplicate(String str){
	
	char[] car ;
	List list = new ArrayList();
	char[] ch = str.toCharArray();
	Set st = new HashSet();
	
	for(int i = 0;i<ch.length;i++) {
		if(!st.add(ch[i])) {
			list.add(ch[i]);
		}
	}
	car = new char[list.size()];
	for(int i=0;i<car.length;i++) {
		car[i] = (char) list.get(i);
	}
	
	return car;
	
}
}
