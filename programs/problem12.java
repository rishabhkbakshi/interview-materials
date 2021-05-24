package programs;

public class problem12 {

	// Write the logic to check palindrome number if the input is a INTEGER.
	private void palindromeInteger(int number) {
		int reminder, reverse = 0, temp;
		temp = number;

		// reversed integer is stored in variable
		while (number != 0) {
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}

		// palindrome if orignalInteger(temp) and reversedInteger(rev) are equal
		if (temp == reverse)
			System.out.println(temp + " is a palindrome.");
		else
			System.out.println(temp + " is not a palindrome.");

	}

}
