package p1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberExeptionand {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("enter a valid input");
			try{
				num=Integer.parseInt(sc.next());
				break;
			}catch(NumberFormatException e) {
				e.printStackTrace();
			}catch(InputMismatchException e) {
				e.printStackTrace();
		}
		

		}
		System.out.println("input valid input");

	}
	

	}


