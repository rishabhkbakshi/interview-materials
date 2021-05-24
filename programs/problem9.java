package programs;

public class problem9 {
	// Write method definition where a-array, n-no of elements in the array.
	void reverse(int a[], int n) {
		int arp[] = new int[n];
		for (int i = a.length - 1; i >= 0; i--) {
			arp[a.length - 1 - i] = a[i];
		}
	}

}
