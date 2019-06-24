package com.ip.exercise;

public class StringNoOfWord {

	public static int numberOfWord(String str) {
		if (str.isEmpty() || str == null) {
			return 0;
		}
		int count = 0;
		char[] ch = new char[str.length()];
		for (int i = 0; i <= str.length(); i++) {
			ch[i] = str.charAt(i);

			if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0))) {
				count++;
			}

		}
		return count;
	}

}
