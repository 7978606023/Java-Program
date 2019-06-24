package com.ip.exercise;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
public static String removeDup(String str) {
	char[] ch = str.toCharArray();
	Set st = new HashSet();
	StringBuilder sb = new StringBuilder();
	for(char c:ch) {
		if(!st.contains(c)) {
			st.add(c);
			sb.append(c);
		}
	}
	return sb.toString();
}
}
