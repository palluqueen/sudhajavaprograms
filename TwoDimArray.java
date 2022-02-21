package p1;

import java.util.Scanner;

public class TwoDimArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 int b[][]=new int[2][2];
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter a martrics");
	 for(int r=0;r<2;r++){
		 for(int c=0;c<2;c++){
			 b[r][c]=sc.nextInt();
		 }
	 }

	
	 System.out.println("entered a martrics");
	 for(int r=0;r<2;r++){
		 for(int c=0;c<2;c++){

System.out.print(b[r][c] + " ");

	}
System.out.println();
}
	}
}
