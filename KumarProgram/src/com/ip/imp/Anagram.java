package com.ip.imp;

import java.util.HashMap;

public class Anagram {

	public static boolean isAnagram(String s1, String s2) {
		String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();

		String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();

		if (s1.isEmpty() || s2.isEmpty() || copyOfs1.length() != copyOfs2.length()) {
			return false;
		} else {
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();

			for (int i = 0; i < copyOfs1.length(); i++) {
				char charAsKey = copyOfs1.charAt(i);
				int charCountAsValue = 0;

				if (map.containsKey(charAsKey)) {
					charCountAsValue = map.get(charAsKey);
				}
				map.put(charAsKey, ++charCountAsValue);

				charAsKey = copyOfs2.charAt(i);

				charCountAsValue = 0;

				if (map.containsKey(charAsKey)) {
					charCountAsValue = map.get(charAsKey);
				}
				map.put(charAsKey, --charCountAsValue);
			}
			for (int value : map.values()) {
				if (value != 0) {
					return false;
				}
			}

		}

		return true;
	}
}
