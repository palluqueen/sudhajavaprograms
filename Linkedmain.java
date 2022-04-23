package p1;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedmain {


	public static void main(String[] args) {
		LinkedList<Integer>ob=new LinkedList<Integer>();
		ob.add(450);
		ob.add(23);
		ob.add(12);
		System.out.println(ob);
		ob.addFirst(3);
		System.out.println(ob);
		ob.addLast(5);
		System.out.println(ob);
		System.out.println(ob.get(2));
		System.out.println(ob.isEmpty());
		//iteration
		Iterator<Integer> it=ob.iterator();
		while(it.hasNext()){
		System.out.println(it.next());

LinkedList<Integer> ob2=(LinkedList<Integer>) ob.clone();
System.out.println(ob2);
Collections.sort(ob2);
System.out.println("after sort"+ob2);

Collections.shuffle(ob2);
System.out.println("after shuffle"+ob2);


		}
		


	}

}
