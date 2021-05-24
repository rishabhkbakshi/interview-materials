package programs;

import java.util.HashMap;
import java.util.Map;

public class problem20 {
	// Write a program to find the most repetitive character in a string?
	public void maxRepeatativeCode(String str) {
		char[] chArr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		int count = 1;
		for (int i = 0; i < chArr.length; i++) {
			if (!Character.isWhitespace(chArr[i])) {
				if (!map.containsKey(chArr[i])) {
					map.put(chArr[i], count);
				} else {
					int temp = map.get(chArr[i]) + 1;
					map.put(chArr[i], temp);
					count = 1;
				}
			}
		}
		int max = 0;
		char maxChar = ' ';
		for (Character ch : map.keySet()) {
			if (map.get(ch) > max) {
				max = map.get(ch);
				maxChar = ch;
			}
		}
		System.out.println("Character is " + maxChar + " => appeared " + max + " times");
	}
}
