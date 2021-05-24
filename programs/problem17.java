package programs;

public class problem17 {

	// Days of the week are represented as three-letter strings
	// ("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun").
	//
	// Write a function 'solution' that, given a string S representing the day
	// of the week and an integer K(between 0 and 500 , inclusive), returns the
	// day of the week that is K days later.
	//
	// For example, given S="Wed" and K=3, function should return "Fri".
	//
	// S="Sat" and K=23, the function should return "Mon"
	// https://www.geeksforgeeks.org/find-the-day-of-the-week-after-k-days-from-the-given-day/
	public static String dayFind(String day, int k) {

		// Create an array with days of the week
		String[] strArr = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };

		// Find index of current day in days array
		int index = 0;
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].equalsIgnoreCase(day)) {
				index = i;
			}
		}

		// return final day
		int nextIndex = (index + k) % 7;
		return strArr[nextIndex];
	}

}
