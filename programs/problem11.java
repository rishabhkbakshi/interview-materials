package programs;

public class problem11 {

	// Write a program to find whether duplicate number exists in an array.
	int findDuplicate(int a[], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					return 1;
				}
			}
		}
		return 0;
	}

}
