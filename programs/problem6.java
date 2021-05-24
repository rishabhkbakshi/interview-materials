package programs;

public class problem6 {

	// Write a function "int remdup(int a[], int n)", which takes an array 'a[]'
	// and its size 'n' as arguments and will remove all the duplicates from the
	// array. The function will return the number of elements in the array after
	// the duplicates have been removed. Do not use any extra array.
	// Ex. If the array contains {1,2,1,2,1,3,3,5,6,1,4} then the function
	// should change the array to {1,2,3,5,6,4} and should return 6 as its value
	public int remdup(int a[], int n) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (i > 0 && a[i] != 0) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						a[j] = 0;
						count++;
					}
				}
				n = n - count;
				count = 0;
			}
		}
		return n;
	}

}
