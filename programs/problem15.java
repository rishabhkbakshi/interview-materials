package programs;

import java.util.ArrayList;
import java.util.List;

public class problem15 {

	// WAP that takes a single String parameter and returns a new Sstring with
	// each whitespace block in the string replaced with a single * character.
	// Non-space characters are unchanges, The functions should change the
	// string in place, Thus if string str is
	// "Hey , r u free now?"
	// Then a call to replaceSpace(str) should return
	// "Hey*,*r*u*free*now?".
	private static String removeWhiteSpace(String str) {
		List<Character> lst = new ArrayList<Character>();
		char[] charArr = str.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			if (!(Character.isWhitespace(charArr[i]) && Character.isWhitespace(charArr[i + 1]))) {
				lst.add(charArr[i]);
			}
		}
		String finalStr = "";
		for (int i = 0; i < lst.size(); i++) {
			if (Character.isWhitespace(lst.get(i))) {
				lst.set(i, '*');
			}
			finalStr = finalStr + lst.get(i);
		}

		return finalStr;
	}

}
