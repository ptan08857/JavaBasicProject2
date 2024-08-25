
public class ClassExample {

	public static void main(String[] args) {
//		String dogName;  we dont need to define instead use dog object
//		String dogColor;
//		String dogBreed;
		
		//className reference Variable/objectName=New className();
		
		Dog dog1=new Dog();
		dog1.name="Tommy";
		dog1.breed="Bulldog";
		dog1.color="Brown";
		
		System.out.println("dog1 name "+dog1.name);
		System.out.println("dog1 color "+dog1.color);
		System.out.println("doge1 breed "+dog1.breed);
		System.out.println("------------------------------");
		//call the method
	dog1.barking();
	dog1.waggingTail();
		
		Dog dog2=new Dog("Lucky", "Black and Brown", "German Shephard",10,5);
		//System.out.println(dog2.breed);
		//System.out.println(dog2.color);
		System.out.println("Dog2 name is "+dog2.name);
		System.out.println("Dog2 Color is "+dog2.color);
		System.out.println("Dog2 breed is "+dog2.breed);
		System.out.println("Total price is  "+dog2.total);
		System.out.println("------------------------------");
		
		Dog dog3=new Dog("Kitty Dog", "Black and White", "Pursian",50,5);
		//System.out.println(dog2.breed);
		//System.out.println(dog2.color);
		System.out.println("Dog3 name is "+dog3.name);
		System.out.println("Dog3 Color is "+dog3.color);
		System.out.println("Dog3 breed is "+dog3.breed);
		System.out.println("Total price is  "+dog3.total);
		System.out.println("------------------------------");
		
		//call the methodto
		dog2.barking();
		dog2.waggingTail();
	}

}

//Blueprint
class Dog{
	//state Field/Vairables
	String name;
	String color;
	String breed;
	int price1;
	int price2;
	int total;

	//Constructor1 (default constructor no values)
	// constructor has same name as the class and public
	// when creating an object constructor will getting call first
	public Dog() {
		System.out.println("Constructor call");
	}
	
	//Constructor12 (Constructor with values)
	public Dog(String Name, String Color, String Breed, int price1, int price2) {
		System.out.println("Parametized Constructor call");
		name = Name;
		color = Color;
		breed = Breed;
		price1=price1;
		price2=price2;
		total = price1 +price2;
		
	}
	
	//behavior -> Methods/Functions
	public void barking() {
		System.out.println("barking");
	}
	public void waggingTail() {
		System.out.println("Waggin tail");
		System.out.println("------------------------");
	}
	
	
}