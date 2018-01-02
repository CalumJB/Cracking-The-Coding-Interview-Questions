
public class URLify {

	
	public static void main(String args[]) {
		String string = "Hello World";
		int len = string.length();
		
		char[] ar = stringToURL(string, len);
		
		for(int i=0; i<ar.length;i++) {
			System.out.printf("%c", ar[i]);
		}
			
	}
	public static char[] stringToURL(String str, int length) {
		
		int newLength = 0;
		//check length of required array
		for(int i=0; i<length;i++) {
			if(str.charAt(i) == ' ') {
				newLength += 2;
			}
			newLength++;
		}
		
		int index = 0;
		//copy string to char array
		char[] array = new char[newLength];
		for(int i=0; i<length; i++) {
			if(str.charAt(i) == ' ')
			{
				array[index] = '%';
				array[index+1] = '2';
				array[index+2] = '0';
				index += 3;
			} else {
				array[index] = str.charAt(i);
				index++;
			}
			
			
		}
		return array;
		
	}
}
