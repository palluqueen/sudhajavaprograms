package p1;

import java.util.HashMap;
import java.util.Map;

class Book {
	String bname;
	String aname;
	int price;
	public Book(String bname, String aname, int price) {
		super();
		this.bname = bname;
		this.aname = aname;
		this.price = price;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
public class mainClass {

	
	public static void main(String[] args) {
		HashMap<Integer,Book> mp=new HashMap<Integer,Book>();
		Book b1=new Book("java","madhu",123);
		Book b2=new Book("c","pavi",1233);
		Book b3=new Book("c++","pallu",1234);

		mp.put(1, b1);
		mp.put(2, b2);
		mp.put(3, b3);
				System.out.println(mp);

//traversing
		for(Map.Entry<Integer, Book>m:mp.entrySet()){
			int k=m.getKey();
			Book b=m.getValue();
			System.out.println(b.getAname()+" "+b.getBname()+" "+b.getPrice());

		}
		

	}

}
