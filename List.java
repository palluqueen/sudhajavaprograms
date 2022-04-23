package p1;

import java.util.ArrayList;
import java.util.Scanner;

public class List {

	
	public static void main(String[] args) {
		ArrayList<String> lst=new ArrayList<String>();
		String e;
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter a number of elements");
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++) {

	    System.out.println("enter a elements");
	    e=sc.next();
	    lst.add(e);
	    	
	    }

	    System.out.println("ArrayList elements is="+lst);
	    System.out.println("enter a element to be search");
	    String  s=sc.next();
	    if(lst.contains(s)) {
		    System.out.println(s+"element is present" );
		    

	    }

	    else {
		    System.out.println( s+ " not enter a elements");

	    }
	    
	}

}

