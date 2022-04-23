package p1;

  interface  Interface {
	  int k=0;
	  void display();
	  void add();
		  
	  }
  class MyClass1 implements Interface {

	@Override
	public void display() {
		System.out.println("display method");
	}
		
	
  
	@Override
	public void add() {
		System.out.println("add  method");

		
	}
	  
  }
	public class InterfaceMainMethod {

	public static void main(String[] args) {
		
		MyClass1 ob=new MyClass1();
		ob.add();
		ob.display();
	}

}
