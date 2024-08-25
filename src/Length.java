
public class Length {

	public static void main(String[] args) {
		  // remarks
		  String name[]= {"Ali", "Boss","John","Paul"};
		  
		  for(int i=0; i<name.length; i++) {
			  System.out.println(name[i]);
			  System.out.println("---------------------");
		  }
          String[] emp= new String[12];
		  String [][] empData= {{"Peter","CEO"},{"Mary","HR"},{"Hector","CFO"}};
		  System.out.println(empData[0][0]);
		  System.out.println(empData[0][1]);
		  empData[0][1]="Architect";
		  System.out.println(empData[0][1]);
		  System.out.println(empData.length);
		  for (int i=0; i<empData.length;i++) {
			  System.out.println("Emplohee Name:="+empData[i][0]);
			  System.out.println("Employee function:="+empData[i][1]);
		  }
		  
		  String[][] empData1=new String[2][3];
		  empData1 [0][0]="Name1";
		  empData1 [0][1]="Designation1";
		  empData1 [0][2]="Department1";
		  
		  empData1 [1][0]="Name2";
		  empData1 [1][1]="Designation2";
		  empData1 [1][2]="Department2";
		  for (int i=0; i<empData1.length;i++) {
			  System.out.println("Emplohee Name:="+empData1[i][0]);
			  System.out.println("Employee Designation:="+empData1[i][1]);
			  System.out.println("Emplohee Department:="+empData1[i][2]);
		  }
		  }
	}


