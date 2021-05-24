package programs;

public class problem19 {

	// Write a program to reverse a string using recursion function
	public static String reverseString(String str) {
		if (str.isEmpty())
			return str;
		// Calling Function Recursively
		return reverseString(str.substring(1)) + str.charAt(0);
	}

}
