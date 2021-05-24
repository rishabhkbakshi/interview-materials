package programs;

public class problem5 {
	
	//	[1,0,1,0,0,1,0,0,1,0]
	//	Suppose this is an array you have to convert this Array to [0,0,0,0,0,0,1,1,1,1]
	//	Write the code.
	
	// First Way
	private int[] countSorting(int[] a) {
		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		int[] temp = new int[max + 1];
		for (int i = 0; i < a.length; i++) {
			temp[a[i]] = temp[a[i]] + 1;
		}
		int counter = 0;
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i]; j++) {
				a[counter] = i;
				counter++;
			}
		}

		return a;
	}
	
	// second way
	private int[] countSorting2(int[] a) {
		int data[] = new int[a.length];
		int fromFirst = 0;
		int fromLast = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				data[fromFirst++] = 0;
			} else {
				data[fromLast--] = 1;
			}
		}

		return data;
	}

}
