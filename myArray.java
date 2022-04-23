package p1;

import java.util.Scanner;

public class myArray {


	public static void main(String[] args) {
		int a[]=new int  [5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a elements");
		for (int i=0;i<a.length;i++){
	
			a[i]=sc.nextInt();
		System.out.println(a[i]);
		
		}
		
		
		try{

		for (int i=0;i<a.length+1;i++){
			System.out.println(a[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		

		System.out.println("b");

	}

}
