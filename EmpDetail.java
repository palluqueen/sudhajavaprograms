package p1;

import java.util.ArrayList;
import java.util.Iterator;

class employee {
int	empid;
String  empname;
String Designatin;
public employee(int empid, String empname, String designatin) {
	super();
	this.empid = empid;
	this.empname = empname;
	Designatin = designatin;
}

}



public class EmpDetail {


	public static void main(String[] args) {
		ArrayList<employee> ob=new ArrayList<employee>();
		employee emp=new employee(1,"sudha","java developer");
		employee emp1=new employee(2,"pallu","c++ developer");
		employee emp2=new employee(1,"chinnu","sql developer");
		employee emp3=new employee(1,"pavi","c developer");
		ob.add(emp);
		ob.add(emp1);
		ob.add(emp2);
		ob.add(emp3);



		
		Iterator<employee> eob= ob. iterator();
		while(eob.hasNext()){
			employee  s=eob.next();
			System.out.println(s.empid+" "+s.empname+" "+s.Designatin);
		}


 

	}

}
