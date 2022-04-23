package p1;

import java.util.Scanner;

public class myException {
	public static void main(String[] args) {
		int a,b,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		a=sc.nextInt();
		System.out.println("enter bnumber");
		b=sc.nextInt();
		try{
		c=a/b;
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			
		}
		System.out.println(c);


	}

}
