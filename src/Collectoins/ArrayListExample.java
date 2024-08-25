package Collectoins;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Peter");
		nameList.add("Pet");
		nameList.add("Pat");
		nameList.add("Per");
		
	    System.out.println(nameList);
	    
	    nameList.add(2, "Raj");
	    System.out.println(nameList);
	    nameList.remove(0);
	    System.out.println(nameList);
	    nameList.remove("Pat");
	    System.out.println(nameList);
	    
	    ArrayList<String> newEmpList = new ArrayList<String>();
	    newEmpList.add("Mark");
	    newEmpList.add("Luke");
	    
	    nameList.addAll(newEmpList);
	    System.out.println(nameList);
	    System.out.println(newEmpList);
	    newEmpList.clear();
	    System.out.println(newEmpList);
	    System.out.println(nameList.size());
	    
	    //3 ways to iterate this ArrayList
	    //1
	    for(int i=0;i<nameList.size();i++) {
	    	System.out.println(nameList.get(i));
	    }
	    
	    //2 Enchaned For-Loop
	    
	    //syntax   for (<Element datatype or Collection> <anyvarName>;<Collection VarName>
	    System.out.println("Enchaned For-Loop----");
	       for(String name:nameList) {
	       System.out.println(name);
	}

	       //3rd way - using iterator
	       System.out.println("myIterator----");
	       Iterator<String> myIterator=nameList.iterator();
	       while (myIterator.hasNext() ) {
	       System.out.println(myIterator.next());
     }
}
}
