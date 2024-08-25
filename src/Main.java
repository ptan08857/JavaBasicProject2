
public class Main {

	public static void main(String[] args) {
		System.out.println(Cat.getCatCount());
		
		Cat myCat = new Cat();
		myCat.meow();    //Inidividaul cat can meow, non static class only can called from individual object
		myCat.name = "Kitty";
		myCat.age = 9;
		myCat.livesRemaining =99 ;
		
	//	Cat.name = "Max";    //Class can't meow, Cat year is the blue print to create individual cat class
		                     // Can't make a static reference to a non-static field Cat.name
		
		System.out.println(Cat.MAX_LIVES);
		System.out.println(Cat.getCatCount());
	}

}
