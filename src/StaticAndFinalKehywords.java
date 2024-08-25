
public class StaticAndFinalKehywords {

	public static void main(String[] args) {
		
		Employee emp1= new Employee();
		Employee emp2= new Employee();
		Employee.setCompanyName("NVIDIA");
		//System.out.println(setCompanyName.companyName);
		emp1.name = "Ali";
		emp2.name = "Billhy";
	System.out.println(emp1.name);
	System.out.println(emp2.name);
	}

}

class Employee{
	String name;
	int id;
	//static String companyName; //Company name is common amoung employee so group them as static
static String companyName="IBM"; //this is ok too
	public static void setCompanyName (String value) {
	   //companyName=value;
    }
	
	public Employee() {
	  System.out.println(companyName);
	  //System.out.println();
}
	
	
}