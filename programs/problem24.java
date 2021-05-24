package programs;

import java.util.HashMap;
import java.util.Map;

public class problem24 {

	// Second given a string we have to find the frequency of each character in
	// alphabetical order and return output string as alphabet and the frequency
	// egcabbage -> a2b2c1e2g2 (Count the letter in the string and provide in
	// proper format)
	// ex:- Input- babacbd then Output is – a2b3c1d1

	public String frequencyFoEachCharacter(String str) {
		String result = "";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
			} else {
				int count = map.get(str.charAt(i));
				map.put(str.charAt(i), count + 1);
			}
		}
		for (Character key : map.keySet()) {
			result = result + key + map.get(key);
		}
		return result;
	}

}
