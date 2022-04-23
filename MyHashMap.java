package p1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MyHashMap {
	public static void main(String[] args) {
		HashMap<Integer,String>   ob=new HashMap<Integer,String> ();
		ob.put(6, "sudha");
		ob.put(7, "queen");
		ob.put(8, "pavi");
		ob.put(9, "pavi");

		System.out.println(ob);
		//traverse or hidrate
		ob.putAll(ob);
		for(Map.Entry m:ob.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
ob.isEmpty();
System.out.println("after empty");
for(Map.Entry m:ob.entrySet()){
	System.out.println(m.getKey()+" "+m.getValue());

	}
	}

}
