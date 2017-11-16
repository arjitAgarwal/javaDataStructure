package com.arjit.datastructure.string;

public class StringUtils {

	static boolean checkVowel(char ch) {
		if (ch == 'a'
				|| ch == 'e'
				|| ch == 'i'
				|| ch == 'o'
				|| ch == 'u') {
			return true;
		}
		
		return false;
	}
}