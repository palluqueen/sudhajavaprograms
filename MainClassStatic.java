package p1;

import java.util.Scanner;

class employee {
	int eid;
	String name;
	static String cname="oracle";

void accept(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a name");
	name=sc.next();
	System.out.println("enter a id");
	eid=sc.nextInt();

	
}
void display() {
	System.out.println(" name"+name);
	System.out.println("eid"+eid);
	System.out.println("company name"+cname);



}
}
public class MainClassStatic {

	public static void main(String[] args) {
		System.out.println("main method");
		employee eob[];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number of employeees");
		int n=sc.nextInt();
		eob=new employee[n];
		for(int i=0;i<n;i++)
			
		{
			eob[i]=new employee();
			eob[i].accept();
			
		}

		System.out.println("Employee deatiles");
		for(int i=0;i<n;i++) {
			eob[i].display();
		}

	}

}
