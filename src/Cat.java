
public class Cat{

	public static final int MAX_LIVES =9;
	private static int catCount = 0; //create a static field that can shore for all the individual cat class through
	                                 // out the life of the program, common object that shared among all the cat class
	String name;
	int    age;
	int    livesRemaining ;
	
	public void meow(){
		System.out.println("Meow");
	}
	
	public Cat() {          //Constructor 
		catCount++;             //to keep tract number of cat created through the program
		livesRemaining = MAX_LIVES;
	}
	
	public static int getCatCount() {
		
	//	System.out.println(age); //Cant make a static reference to a non-static field age
		return catCount;
	}
}
