package p1;

import java.util.ArrayList;

public class ArrayListmain {
	public static void main(String[] args) {
		ArrayList lst=new ArrayList();
		lst.add(242);
		lst.add("sudha");
		lst.add(23.7f);
		lst.add(45.9);
		lst.remove(2);
		lst.clear();
		lst.add(4545);
		lst.addAll(lst);
		System.out.println(lst);

	}

}
