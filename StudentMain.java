package p1;

import java.util.ArrayList;
import java.util.Iterator;

class student{
	int sid;
	String sname;
	float fees;
	public student(int sid, String sname, float fees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.fees = fees;
	}
	
}
public class StudentMain{
	public static void main(String[] args) {
		ArrayList<student> ob= new ArrayList<student>();
		student sob=new student(1,"sudha",166.2f);
		student sob1=new student(2,"pallu",177.2f);
		student sob2=new student(3,"meghu",188.2f);
		ob.add(sob);
		ob.add(sob1);
		ob.add(sob2);


	Iterator<student>  sit=ob.iterator();
	while(sit.hasNext()){
		student s=sit.next();
		System.out.println(s.sid+" "+s.sname+" "+s.fees);
	}


	

	}

}
