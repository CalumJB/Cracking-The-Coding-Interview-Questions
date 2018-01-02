
public class IsUnique {

	public static void main(String args[]) {
		String str = "Heloi ";
		boolean ans = isCharInStringUnique(str);
		System.out.println(ans);
		
		
	}
	
	//Method that check whether chars in string are unique
	public static boolean isCharInStringUnique(String str) {
		
		//create a boolean array with sapce for all ascii chars (128)
		//array starts as false, if char is added that index turns true
		//if true is found when placing dublication is found
		
		boolean[] array = new boolean[128]; //default false
		
		//iterate through string and place chars in array
		for(int i=0; i<str.length(); i++) {
			
			int value = str.charAt(i); //get char value
			if(array[value] == true) {
				return false;
			} else {
				array[value] = true;
			}
			
		}
		return true;

	}
	
}
