package programs;

public class problem13 {

	// Write the logic of Armstrong Number ?
	private void armstrongNumber(int number) {
		int c = 0, reminder, temp;
		temp = number;
		while (number > 0) {
			reminder = number % 10;
			number = number / 10;
			c = c + (reminder * reminder * reminder);
		}
		if (temp == c) {
			System.out.println("armstrong number");
		} else {
			System.out.println("Not armstrong number");
		}
	}

}
