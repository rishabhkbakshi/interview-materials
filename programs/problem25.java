package programs;

public class problem25 {

	// Third question was given input1 as n and input 2 to as array of integer
	// of length n, We have to iterate through the array and find if any number
	// is greater than n by two times occurring in the array if yes then the
	// output is the number else return -1 (Return the letter which is repeated
	// more then half times else return -1)
	public int countRepeatativeLetter(int n, int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		int[] tempArr = new int[max + 1];
		for (int i = 0; i < arr.length; i++) {
			tempArr[arr[i]] = tempArr[arr[i]] + 1;
		}

		int count = 0;
		int num = 0;
		for (int i = 0; i < tempArr.length; i++) {
			if (count < tempArr[i]) {
				count = tempArr[i];
				num = i;
			}
		}

		// 		using hashmap
		//
		//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		//		for (int i = 0; i < arr.length; i++) {
		//			if (!map.containsKey(arr[i])) {
		//				map.put(arr[i], 1);
		//			} else {
		//				map.put(arr[i], map.get(arr[i]) + 1);
		//			}
		//		}
		//		
		//		int count  = 0;
		//		int num  = 0;
		//		for (int key : map.keySet()) {
		//			if(count < map.get(key)) {
		//				count = map.get(key);
		//				num = key;
		//			}
		//		}

		if (count == n / 2) {
			return num;
		} else {
			return -1;
		}
	}

}
