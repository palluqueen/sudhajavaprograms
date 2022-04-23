package p1;

import java.util.Scanner;

public class Myname {
	public static void main(String[] args) {
		String name;
		int age;
		int sid;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name");
		name=sc.nextLine();
		System.out.println("enter a age");
		age=sc.nextInt();
		System.out.println("entera a sid");
		sid=sc.nextInt();
	

	
	System.out.println("name="+name);
	System.out.println("age="+age);
	System.out.println("sid="+sid);

	}

}
