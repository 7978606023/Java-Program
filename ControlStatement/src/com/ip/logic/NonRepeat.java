package com.ip.logic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonRepeat {
	public static char firstNonrepeat(String str) {
		Set<Character> repeating = new HashSet<>();
		List<Character> nonrepeating = new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			char letter = str.charAt(i);
			if(repeating.contains(letter)) {
				continue;
			}
			if(nonrepeating.contains(letter)) {
				nonrepeating.remove((Character) letter);
				repeating.add(letter);
			}
			else {
				nonrepeating.add(letter);
			}
		}
		return nonrepeating.get(0);
	}
}
