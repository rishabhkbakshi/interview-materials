package programs;

import java.util.HashSet;
import java.util.Set;

public class problem1 {

	// "abdacf" and "jhdashf" => Find the first duplicate alphabet in this
	// string (write an efficient program).
	public void firstDup(String str) {
		char[] carr = str.toCharArray();
		char ch = ' ';
		for (int i = 0; i < carr.length; i++) {
			for (int j = i + 1; j < carr.length; j++) {
				if (carr[i] == carr[j]) {
					ch = carr[i];
					System.out.println(ch);
					return;
				}
			}
		}
	}
			// or
	public char firstDup2(String str) {
		Set<Character> h = new HashSet<Character>();

		// Traverse the input array from left to right
		for (int i = 0; i <= str.length() - 1; i++) {
			char c = str.charAt(i);

			// If element is already in hash set, update x
			// and then break
			if (h.contains(c)) {
				return c;
			}

			else {// Else add element to hash set
				h.add(c);
			}
		}
		return '\0';
	}

}
