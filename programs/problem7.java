package programs;

public class problem7 {

	// Write a function "int maxPos(int x)" to find out the position of the
	// largest digit in a given number. The position is to be counted from the
	// left. You can assume 'x' is the positive integer.
	// Ex. If x is 3482 then the function should return 3, Because the largest
	// digit 8 is at the 3rd position from the left
	public int maxPos(int num) {
		int rem = 0;
		int largest = 0;
		int count = 1;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;

			if (rem > largest) {
				largest = rem;
			} else {
				count++;
			}
		}
		return count;
	}

}
