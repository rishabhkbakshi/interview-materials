package programs;

import java.util.HashMap;
import java.util.Map;

public class problem26 {

	// WAP to find the list of duplicate number from the array means
	// {2,3,1,5,3,2,3,5,4} => {2,3,5}
	// more then half times else return -1)
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
