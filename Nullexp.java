package p1;

import java.util.Scanner;

public class Nullexp {
	public static void main(String[] args) {
		String s=null;
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("enter a name");
			s=sc.nextLine();
			System.out.println(" aname="+s);

		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		

	}

}
