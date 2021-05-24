package programs;

public class problem14 {

	// Suppose you have this type of string "3+1+5+2+4+7+6".
	// So WAP a program to print this string into ths form "1+2+3+4+5+6+7".
	String sortedString(String str) {
		String[] strArr = str.split("\\+");
		int[] intArr = new int[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}

		for (int i = 0; i < intArr.length - 1; i++) {
			for (int j = 0; j < intArr.length - 1; j++) {
				if (intArr[j] > intArr[j + 1]) {
					int temp = intArr[j + 1];
					intArr[j + 1] = intArr[j];
					intArr[j] = temp;
				}
			}
		}
		String temp = "";

		for (int i = 0; i < intArr.length; i++) {
			temp += intArr[i] + "+";
		}

		return temp.substring(0, temp.length() - 1);

		// return StringUtils.join(ArrayUtils.toObject(intArr), "+");
	}

}
