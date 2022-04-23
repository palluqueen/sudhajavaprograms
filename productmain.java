package p1;

import java.util.ArrayList;
import java.util.Iterator;



class product{
	int pid;
	String pname;
	float pfees;
	public product(int pid, String pname, float pfees) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pfees = pfees;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPfees() {
		return pfees;
	}
	public void setPfees(float pfees) {
		this.pfees = pfees;
	}
}
public class productmain {

	public static void main(String[] args) {
		ArrayList<product> ob=new ArrayList<product>();
		product p=new product(1,"phone",234000f);
		product p1=new product(2,"pen",2564000f);
		product p2=new product(3,"book",344000f);
		ob.add(p);
		ob.add(p1);
		ob.add(p2);

Iterator<product> ip=ob.iterator();
while(ip.hasNext()){
product op=ip.next();
System.out.println(op.getPid()+" "+op.getPname()+" "+op.getPfees());

	}

}
}
