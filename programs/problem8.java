package programs;

public class problem8 {

	// Check that string is palindrome or not. Do not use extra array.
	// Ex. "deed", 383

	// way 1
	public boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String rev = sb.toString();
		if (str.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}

	// way 2
	private void palindromeString(String str) {
		String rev = "";
		int length = str.length();

		for (int i = length - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev))
			System.out.println(str + " is a palindrome");
		else
			System.out.println(str + " is not a palindrome");
	}

}
