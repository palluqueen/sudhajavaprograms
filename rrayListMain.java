package p1;

import java.util.ArrayList;
import java.util.Scanner;

public class rrayListMain {

	
	public static void main(String[] args) {
		ArrayList<Integer> lst=new ArrayList<Integer>();
		int e;
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter a number of elements");
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++) {

	    System.out.println("enter a elements");
	  int  en=sc.nextInt();
	    lst.add(en);
	    	
	    }

	    ArrayList<Integer> cl=(ArrayList <Integer>) lst.clone();
	    System.out.println( cl);
	     
	    System.out.println( lst.subList(2, 1));
	    
	
	
	
	}

}
