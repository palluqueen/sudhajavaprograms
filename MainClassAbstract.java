package p1;
interface MyInterface1  {
	int k=0;
	void display();
	void add();
}
abstract class myclass implements MyInterface1 {
	public void display(){
System.out.println("display method");		
	}
}
	class second extends myclass {

		@Override
		public void add() {
		
			System.out.println("add method");		

		}
		
	}

public class MainClassAbstract {


	public static void main(String[] args) {
		second ob=new second();
		ob.add();
		ob.display();
		

	}

}
