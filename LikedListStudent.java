package p1;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;


class Studentp{
 int sid;
 int smarks;
 String name;
public Studentp(int sid, int smarks, String name) {
	super();
	this.sid = sid;
	this.smarks = smarks;
	this.name = name;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public int getSmarks() {
	return smarks;
}
public void setSmarks(int smarks) {
	this.smarks = smarks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
} 
}
class StudentpMarksCompare implements Comparator<Studentp> 
{
	@Override
	public int compare(Studentp o1, Studentp o2) {
		//return 01.getName().compareTo(02.getname());
		return o1.smarks-o2.smarks;

}
}
	class StudentpidCompare implements Comparator<Studentp> {

		@Override
		public int compare(Studentp o1, Studentp o2) {
			// TODO Auto-generated method stub
			return o1.sid-o2.sid;
		} 

	}



public class LikedListStudent {
	
	public static void main(String[] args) {
		LinkedList<Studentp> ob=new LinkedList<Studentp>();

		Studentp sob=new Studentp(1,123,"pallu");
		Studentp sob1=new Studentp(2,124,"pavi");
		Studentp sob2=new Studentp(3,125,"madhu");
		ob.add(sob);
		ob.add(sob1);
		ob.add(sob2);
	
		
		Iterator<Studentp> iob=ob.iterator();
		System.out.println("before replace");
		while(iob.hasNext())
		{
			Studentp bo=iob.next();
			System.out.println("sid ="+bo.getSid()+" "+"smarks="+bo.getSmarks()+" "+"sname="+bo.getName());
		}
	       Collections.sort(ob,new StudentpMarksCompare());
			System.out.println("after  sort");

		Iterator<Studentp> iob1=ob.iterator();
		
		while(iob1.hasNext())
		{


			Studentp bo=iob1.next();
			System.out.println("sid ="+bo.getSid()+" "+"smarks="+bo.getSmarks()+" "+"sname="+bo.getName());

		}


	}

}








