
public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyBrowser obj=new Firefox();
        Firefox obj1=new Firefox();
        MyCustomBrowser obj2=new opera();
        MyBrowser obj3=new opera();
	}

}

//add interface to provide standard for all browsers and specification eg. openUrl(), refresh()
//bookMark()

interface MyBrowser{
	public void openUrl ();
	public void refresh();
	public void bookMark();
		
}

//Abstract means not fully implemented class so you can implement one or no method
abstract class MyCustomBrowser implements MyBrowser{
	public void openUrl (){
		System.out.println("Open the URL");
	}
	// he does not know how to implement refresh and bookmark;
}

// if a manufacturer open up a opera browser doesnt want to open URl so he use extends

class opera extends MyCustomBrowser{

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bookMark() {
		// TODO Auto-generated method stub
		
	}
	
}

class Firefox implements MyBrowser{
	public void openUrl () {
		
	}
	public void refresh() {
		
	}
	public void bookMark() {
		
	}
}

class Chrome implements MyBrowser{
	public void openUrl () {
		
	}
	public void refresh() {
		
	}
	public void addPlugIns() {
		
	}
	@Override
	public void bookMark() {
		// TODO Auto-generated method stub
		
	}

}

class Edge implements MyBrowser{
	public void openUrl () {
		
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bookMark() {
		// TODO Auto-generated method stub
		
	}
	
}

class saferi implements MyBrowser{

	@Override
	public void openUrl() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bookMark() {
		// TODO Auto-generated method stub
		
	}
	
}