package programs;

public class problem18 {

	// Given an array arr[] of size n containing integers. The problem is to
	// find the length of the longest sub-array having sum equal to the given
	// value k.
	//
	// Find a longest sub array and sub array element value should be equal to
	// 25
	// int [] a = {2,4,5,9,11,21,4};
	// int n = 25;

	// https://www.geeksforgeeks.org/longest-sub-array-sum-k/ => the answer will
	// be 3 and the array will be {5,9,11}
	// https://www.techiedelight.com/find-maximum-length-sub-array-having-given-sum/

	public int findMaxLenSubarray(int[] a, int sum) {
		int subArrLen = 0;
		int start = 0, end = 0;
		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			int resultArrLen = 0;
			for (int j = i; j < a.length; j++) {
				temp = temp + a[j];
				if (temp == sum) {
					resultArrLen = j - i + 1;
					if (subArrLen < resultArrLen) {
						subArrLen = resultArrLen;
						start = i;
						end = j;
					}
				}
			}
		}
		System.out.println("startIndex => " + start);
		System.out.println("endIndex => " + end);
		System.out.println("subArray length  => " + subArrLen);
		return subArrLen;
	}
}
