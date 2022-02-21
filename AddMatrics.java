package p1;

import java.util.Scanner;

public class AddMatrics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[][],b[][],c[][],r1,r2,c1,c2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row and coloum");
		r1=sc.nextInt();
		c1=sc.nextInt();
		System.out.println("enter second row and coloum");

		r2=sc.nextInt();
		c2=sc.nextInt();
		
		if(r1==r2 && c1==c2){
			a=new int[r1][r2];
			b=new int[c1][c2];
			c=new int[r1][c1];//
System.out.println("enter first matrics"+r1+"x"+c1);

for (int i=0;i<r1;i++){
	for (int j=0;j<c1;j++){
		a[i][j]=sc.nextInt();
	}

	
}
		//second matrics
System.out.println("enter first matrics"+r2+"x"+c2);
for (int i=0;i<r2;i++){
for (int j=0;j<c2;j++){
	b[i][j]=sc.nextInt();
}


}

		
	//addition
      for (int i=0;i<r2;i++){
	   for (int j=0;j<c2;j++){
		c[i][j]=a[i][j]+b[i][j];

	}

      }

      //display matrics
      System.out.println("addition of two matrices");
      for (int i=0;i<r2;i++){
   	   for (int j=0;j<c2;j++){
System.out.print(c[i][j] + " ");
      }
   	   System.out.println();
      }
      }
		if(r1==c1 && r2==c2){
			System.out.println("addition is possible");
		}
			else {
				System.out.println("additon is notpossible");
			}
		}
	}
	
	

