package com.ip.exercise;

public class StringRotation {

	public static boolean isRotation(String a, String b) {
		int n = a.length();
		int m = b.length();
		if (n != m)
			return false;
		int lps[] = new int[n];

		int len = 0;
		int i = 1;
		lps[0] = 0;

		while (i < n) {
			if (a.charAt(i) == b.charAt(len)) {
				lps[i] = ++len;
				++i;
			} else {
				if (len == 0) {
					lps[i] = 0;
					++i;
				} else {
					len = lps[len - 1];
				}
			}
		}

		i = 0;

		for (int k = lps[n - 1]; k < m; ++k) {
			if (b.charAt(k) != a.charAt(i++))
				return false;
		}
		return true;
	}
	public static void main(String args[]) {
		System.out.println(isRotation("anubhav","visal"));
	}

}
