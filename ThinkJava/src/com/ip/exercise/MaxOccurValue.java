package com.ip.exercise;

public class MaxOccurValue {
public static char maxOccur(String str) {
	int[] freq = new int[str.length()];
	char minchar = str.charAt(0) , maxchar = str.charAt(0);
	int min,max;
	char string[] = str.toCharArray();
	for(int i = 0;i<string.length;i++) {
		freq[i] =1;
		for(int j = i+1;j<string.length;j++) {
			 if(string[i] == string[j] && string[i] != ' ' && string[i] != '0')  {
				freq[i]++;
				string[j]='0';
			}
		}
	}
	min = max = freq[0];
			for(int i = 0;i<freq.length;i++) {
				if(min > freq[i]&&freq[i]!='0') {
					min =freq[i];
					minchar = string[i];
				}
				if(max<freq[i]) {
					max = freq[i];
					maxchar = string[i];
				}
			}
	return minchar;
}
}
