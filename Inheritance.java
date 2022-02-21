


	class A {
		int i;
		A() {
			i=10;
			System.out.println("i="+i);
		}
	}
	class B extends A {
		int j;
		B() {
		j=25;

		}
		void add()  {
			int s=i+j;
			System.out.println("sum="+s);

		}
	}
	
	
	public class Inheritance {
		
	
	public static void main(String[] args) {
		B ob= new B();
		ob.add();
		
		
	}	
		

	}


