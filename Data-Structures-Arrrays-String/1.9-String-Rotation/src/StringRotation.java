
public class StringRotation {
	
	public static void main(String[] args) {
		String string = "waterbottle";
		String rotation = "erbottlewat";
		boolean result = isRotationOf(string, rotation);
		System.out.println(result);
	}

	public static boolean isRotationOf(String str1, String str2) {
		
		boolean found = false;
		String pt1 = "";
		String pt2 = "";
		
		for(int i=0;i<str1.length(); i++) {
			if(str2.charAt(i) == 'w')
				found = true;
			
			if(!found) {
				pt1 += str2.charAt(i);
			} else {
				pt2 += str2.charAt(i);
			}
		}
		
		String pt2pt1 = pt2 + pt1;
		
		if(str1.contains(pt2pt1)) {
			return true;
		} else {
			return false;
		}
		
	}
}
