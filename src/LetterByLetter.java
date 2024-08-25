
public class LetterByLetter {

	public static void main(String[] args) {
	
	        char[] charArray1 = {'h', 'e', 'l', 'l', 'o'}; 
	        char[] charArray2 = {'h', 'e', 'l', 'l', 'o'}; 
	         
	        boolean isEqual = true; 
	         
	        if (charArray1.length != charArray2.length) { 
	            isEqual = false; 
	        } else { 
	            for (int i = 0; i < charArray1.length; i++) { 
	                if (charArray1[i] != charArray2[i]) { 
	                    isEqual = false; 
	                    break; 
	                } 
	            } 
	        } 
	         
	        if (isEqual) { 
	            System.out.println("The character arrays are equal."); 
	        } else { 
	            System.out.println("The character arrays are not equal."); 
	        } 
	    } 
	} 

