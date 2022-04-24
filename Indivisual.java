package p1;

import java.util.Scanner;

public class Indivisual {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,digit,sum=0;
System.out.println("enter a number");
num=sc.nextInt();
while(num!=0){
	digit=num%10;
	sum=sum+digit;
	num=num/10;
System.out.println("the number is="+sum);
	
}


	}

}
