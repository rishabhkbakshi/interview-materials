package programs;

public class problem10 {

	// Write method definition where a-array, n-no of elements in the array, num
	// = number to be inserted, pos=Postion at which num has to be inserted.
	int[] insertAt(int a[], int n, int num, int pos) {
		int temp[] = new int[n + 1];
		for (int i = 0; i < temp.length; i++) {
			if (i < pos - 1) {
				temp[i] = a[i];
			}
			if (i == pos - 1) {
				temp[i] = num;
			}
			if (i > pos - 1) {
				temp[i] = a[i - 1];
			}
		}
		return temp;
	}

}
