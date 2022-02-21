package p1;

import java.util.Scanner;

public class SumAvg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
int a[]=new int[5];
 int sum=0;
float avg=sum/a.length;
System.out.println("enter a elements"+a.length);
for(int i=0;i<=a.length;i++){
a[i]=sc.nextInt();

	}
System.out.println("the elemets are"+a.length);
for(int i=0;i<=a.length;i++){
sum=sum+a[i];
}
System.out.println("the sum is"+sum);



System.out.println("the elemets are"+a.length);
for(int i=0;i<=a.length;i++) {

	avg=(float) sum/a.length;
}
	System.out.println("the avg is"+avg);
}
	}


	
	

