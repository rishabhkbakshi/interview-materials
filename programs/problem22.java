package programs;

import java.util.Arrays;
import java.util.List;

public class problem22 {
	// String a = "hii how are you, Rishabh!!";
	// // W.a.p to reverse the words in a string and print it, by removing all
	// the special chars.
	// Sample Output: Rishabh you are how hii

	// Way 1
	public void reverseTheWordandRemoveSpecialChar() {
		String str = "hii how are you, Rishabh!!";
		List<String> lst = Arrays.asList(str.split(" "));
		String result = "";
		for (int i = lst.size() - 1; i >= 0; i--) {
			char[] ch = lst.get(i).toCharArray();
			String temp = "";
			for (int j = 0; j < ch.length; j++) {
				if (Character.isLetter(ch[j])) {
					temp = temp + ch[j];
				}
			}
			result = result + temp + " ";
		}
		System.out.println(result);
	}

	// Way 2
	public void reverseTheWordandRemoveSpecialChar2() {
		String str = "hii how are you, Rishabh!!";
		List<String> lst = Arrays.asList(str.split(" "));
		String result = "";
		for (int i = lst.size() - 1; i >= 0; i--) {
			result = result + lst.get(i).replaceAll("[^a-zA-Z0-9]", "") + " ";
		}
		System.out.println(result.substring(0, result.length() - 1));
	}

}
