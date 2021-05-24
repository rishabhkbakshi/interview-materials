package programs;

import java.util.HashMap;
import java.util.Map;

public class problem4 {

	//	WAP to find the count of repeatative charactor in a string 
	//	e.g. "Ashish" => A-1, S-2, H-2, i-1
	private static void findDuplicateCharsWithCount(String str) {
		System.out.println("Duplicates in- " + str);
		int count;
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			// Take one char at a time
			char c = str.charAt(i);
			// don't count the spaces
			if (c == ' ')
				continue;
			for (int j = i + 1; j < str.length(); j++) {
				if (c == str.charAt(j)) {
					count++;
					// remove the char so that it is not picked again
					// in another iteration
					str = str.substring(0, j) + str.substring(j + 1);
				}
			}
			if (count > 1) {
				System.out.println(c + " found " + count + " times");
			}
		}
	}
	
	
	// WAP to find the list of duplicate number from the array means 
	// {2,3,1,5,3,2,3,5,4} => {2,3,5}
	public static void FindTheDuplicateValue() {
		int[] intArray = { 2, 3, 1, 5, 3, 2, 3, 5, 4 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (!map.containsKey(intArray[i])) {
				map.put(intArray[i], 1);
			} else {
				count = map.get(intArray[i]) + count + 1;
				map.put(intArray[i], count);
				count = 0;
			}
		}
		
		for (int i : map.keySet()) {
			if (map.get(i) > 1) {
				System.out.println(i);
			}
		}
	}

}
