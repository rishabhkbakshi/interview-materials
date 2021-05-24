package programs;

import java.util.ArrayList;
import java.util.List;

public class problem16 {
	// Write a function:
	//
	// class Solution { public int solution(int[] A); }
	//
	// that, given an array A of N integers, returns the smallest positive
	// integer (greater than 0) that does not occur in A.
	// For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
	// Given A = [1, 2, 3], the function should return 4.
	// Given A = [-1, -3], the function should return 1.
	public static int solution(int[] A) {
		int max = A[0];
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(max);
		for (int i = 1; i < A.length; i++) {
			lst.add(A[i]);
			if (max < A[i]) {
				max = A[i];
			}
		}
		int find = 0;
		for (int i = 1; i <= max; i++) {
			if (!lst.contains(i)) {
				find = i;
			}
		}
		if (find == 0) {
			find = max < 0 ? 1 : max + 1;
		}
		return find;
	}

}
