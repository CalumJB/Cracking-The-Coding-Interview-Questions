
public class OneAway {
	
	public static void main(String[] args) {
		String string1 = "pale";
		String string2 = "pallle";
		
		String result = checkIfStringChanged(string1, string2);
		
		System.out.println(result);
	}

	public static String checkIfStringChanged(String str1, String str2) {
		boolean changes = false;
		int length1 = str1.length();
		int length2 = str2.length();
		int counter1 = 0;
		int counter2 = 0;
		
		//check if add performed
		if(length2 == length1 + 1) {
			for(int i=0;i<length1;i++) {
				if(str1.charAt(counter1) != str2.charAt(counter2)) {
					if(changes) {
						return "false";
					} else {
						changes = true;
						counter2++;
					}
				}
				counter1++;
				counter2++;
			}
			return "add";
		//check if change replace performed
		} else if (length2 == length1) { 
			for(int i=0;i<length1;i++) {
				if(str1.charAt(counter1) != str2.charAt(counter2)) {
					if(changes) {
						return "false";
					} else {
						changes = true;
					}
				}
				counter1++;
				counter2++;
			}
			return "replace";
			
		} else if (length2+1 == length1) { 
			for(int i=0;i<length1-1;i++) {
				if(str1.charAt(counter1) != str2.charAt(counter2)) {
					if(changes) {
						return "false";
					} else {
						changes = true;
						counter1++;
					}
				}
				counter1++;
				counter2++;
			}
			return "remove";
		} else {
			return "false";
		}
	}
}
