package p1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Student{
 int sid;
 int smarks;
 String name;
public Student(int sid, int smarks, String name) {
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
class StudentMarksCompare implements Comparator<Student> 
{
	@Override
	public int compare(Student o1, Student o2) {
		//return 01.getName().compareTo(02.getname());
		return o1.smarks-o2.smarks;

}
}
	class StudentidCompare implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.sid-o2.sid;
		} 

	}



public class TreeStudent {
	
	public static void main(String[] args) {
		TreeSet<Student> ob=new TreeSet<Student>(new StudentMarksCompare());

		Student sob=new Student(1,123,"pallu");
		Student sob1=new Student(2,124,"pavi");
		Student sob2=new Student(3,125,"madhu");
		ob.add(sob);
		ob.add(sob1);
		ob.add(sob2);

		Iterator<Student> iob=ob.iterator();
		while(iob.hasNext())
		{
			Student bo=iob.next();
			System.out.println("sid ="+bo.getSid()+" "+"smarks="+bo.getSmarks()+" "+"sname="+bo.getName());
		}

		Iterator<Student> iob1=ob.iterator();
		while(iob.hasNext())
		{


			Student bo2=iob.next();
			System.out.println("sid ="+bo2.getSid()+" "+"smarks="+bo2.getSmarks()+" "+"sname="+bo2.getName());
		}
	}

}







