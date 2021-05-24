package programs;

import java.util.Arrays;
import java.util.List;

public class problem2 {
	
	// String str = "My name is Rajat Arora";
	
	// 1.  arora tajar si eman ym (Without using any inbuilt method)
	public void StringManipulation(String str){
		String tempStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			tempStr = tempStr + str.charAt(i);
		}
		System.out.println(tempStr);
	}
	
	//	2. My name is Rajat Arora
	//		My name is Rajat
	//	     My name is
	//	      My name
	//	       My
	public void StringManipulation2(String str){
		String tempStr = "";
		String[] strArray = str.split(" ");
		for (int i = strArray.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				tempStr = tempStr + " " + strArray[j];
			}
			System.out.println(tempStr);
			tempStr = "";
		}
	}
	
	// 3.My name is Rajat Arora
	//	 Arora Rajat is name My (Rajat is name my)
	//	 My name is Rajat (Name is Rajat)
	//	 Rajat is name (Is name)
	//	 name is (Name)
	//	 is
	// (Reverse the string by words not by the letters. After that remove the first word then again follow the same step till the string contains only one word)
	public void StringManipulation3(String str){
		String tempStr = "";
		String[] strArray = str.split(" ");
		for (int i = 0; i < str.split(" ").length; i++) {
			for (int j = strArray.length - 1; j >= 0; j--) {
				tempStr = (tempStr + " " + strArray[j]).trim();
			}
			System.out.println(tempStr);

			strArray = tempStr.substring(tempStr.indexOf(" ") + 1).split(" ");
			tempStr = "";
		}
	}
	
	// 4. yM eman si tajaR arorA 
	public void StringManipulation4(String str){
		String[] strArr = str.split(" ");
		List<String> lstStr = Arrays.asList(strArr);

		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < lstStr.size(); i++) {
			sb.append(lstStr.get(i));
			System.out.print(sb.reverse() + (i == lstStr.size() - 1 ? "" : " "));
			sb = new StringBuilder();
		}
	}

}
