package p1;

public class DifferentBlocks {

static {
	System.out.println("static will execute before main");
}
{
	System.out.println("normal blocks before constructore on object creation");

}
DifferentBlocks() {
	System.out.println("on object creation constructore will executes");

}
void display(){
	System.out.println("Disoplay method");

}

	public static void main(String[] args) {
		System.out.println("main Method");
		DifferentBlocks ob=new DifferentBlocks();
		ob.display();
		

	}

}
