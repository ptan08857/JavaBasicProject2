package ExceptionTest;

public class UncheckException {

	public static void main(String[] args) {
	
		 String name = null;
		 String name2 = "John";
		 printLength(name);
		 printLength(name2);

	}

	private static void printLength (String myString) {
		try {
		System.out.println(myString.length());
	}
		catch (NullPointerException npe) {
			System.out.println("String can't be null");
		}
}
}
