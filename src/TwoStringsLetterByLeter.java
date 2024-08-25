
public class TwoStringsLetterByLeter {

	public static void main(String[] args) {
		String str1="hello";
		String str2="he6lo";
		
		boolean isEqual = true;
		
		if (str1.length() !=str2.length()) {
			isEqual = false;
		} else {
			for (int i=0;  i<str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					   isEqual = false;
				}
				
			}
		}
			if (isEqual) {	
            System.out.println("The strings are equal.");
            
			} else {
				System.out.println("The strings are not equal.");
			}
	}

}
