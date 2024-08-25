
public class Static1 {

	public static void main(String[] args) {
		// Static Method: Class itself
          sayhi();
          
       // Non Static Method: Instance of a Class  
          
          Static1 s = new Static1();
          s.sayHotdog();
	}
	
     static void sayhi() {
    	 System.out.println("Static HI");
     }
     
 
     void sayHotdog() {
    	 
    	 System.out.println("Hot dog");
     }
}
