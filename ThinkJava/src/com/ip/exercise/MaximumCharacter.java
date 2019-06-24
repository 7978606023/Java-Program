package com.ip.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MaximumCharacter {
	public static char maxvalue(String s) {
		char[] ch = s.toCharArray();
		int size = ch.length;
		Map<Character, Integer> map = new LinkedHashMap<>();
		int i = 0;
		char maxkey = ' ';
		int maxvalue = 0;
		while (i != size) {
			if (map.containsKey(ch[i]) == false) {
				map.put(ch[i], 1);
			} else {
				int oldvalue = map.get(ch[i]);
				int newvalue = oldvalue + i;
				map.put(ch[i], newvalue);
			}
			++i;
			Set<Map.Entry<Character, Integer>> ihmap = map.entrySet();
			
			for (Map.Entry<Character, Integer> data : ihmap) {
				if (data.getValue() > maxvalue) {
					maxvalue = data.getValue();
					maxkey = data.getKey();
				}
			}
		}
		return maxkey;
	}
}
