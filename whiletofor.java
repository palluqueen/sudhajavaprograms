package p1;

import java.util.Scanner;

public class whiletofor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  Scanner sc =new Scanner(System.in);
		  int i;
		  
		  System.out.println("enetr a number");
		  i=sc.nextInt();
		  while(i<=100){
			  System.out.println("the number is"+i);
		  }
		
		for(i=0;i>=100;i++){
			System.out.println("the number is less than i"+i);
		}

	}

}

