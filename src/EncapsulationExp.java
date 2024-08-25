
public class EncapsulationExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student std1=new Student("John", 23);
//         std1.name="Abc";  //external data can modify value of field without going to the class
//                              when String Name is not define as private String name
//         std1.rollNo=228800;//external data can't update the data when private is set without letting the object knows about it
         
         std1.setName("AAAA");
         std1.setRollNo(45555);
         std1.disp();
	}

}

class Student{
	private String name; // by defining as private row 7 if uncomment will get error
	private int rollNo;  // so private make it full encapsulated, only can enter from object
	//String name;
	//int rollNo;
	public Student(String name, int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
		
	}
	
	public void disp() {
		System.out.println("Name of the student" +" "+this.name);
		System.out.println("Roll no of the rollNo" +" "+this.rollNo);
	}
	
	public void setName(String name) {
		this.name=name;
	}
    public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}
}
