package programs;

public class problem23 {
	// First question was if given string in c++ variable format then we have to
	// convert it in Java variable format and vice-a-versa as per the input
	// string (Rename input variable name from c++ to java and vice-versa)
	// ex:- If name is First_variable then convert it to FirstVariable.
	public String changeTheVariableName(String var) {
		String result = "";
		if (var.contains("_")) {
			for (int i = 0; i < var.length(); i++) {
				if (var.charAt(i) == '_') {
					result = result + var.substring(i + 1, i + 2).toUpperCase();
					i++;
				} else {
					result = result + var.charAt(i);
				}
			}
		} else {
			String lowerStr = var.toLowerCase();
			for (int i = 0; i < var.length(); i++) {
				if (i != 0 && Character.isUpperCase(var.charAt(i))) {
					result = result + '_' + lowerStr.charAt(i);
				} else {
					result = result + lowerStr.charAt(i);
				}
			}
		}
		return result;
	}
}
