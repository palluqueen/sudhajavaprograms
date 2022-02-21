package p1;

import java.util.Scanner;

public class CurrenrBill {

	/**
	 * @param args
	 */
	public static void main(String[]args){
		float units;
		
		double fixedrate=2.20,amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("entera a unit amount");
		units=sc.nextFloat();
		if(units<=100){
		 amount=units*1.50+fixedrate;
		 
			}
		else if(units>=101 && units<=150){
			amount=units*1.50+50*2f+(units-150)*2.50f+fixedrate;
			
		}
		else if(units>=151 && units<=250){
			amount=100*1.50+50*2.00f+(units-150)+fixedrate;
		}
		else{
			amount=100*1.50+50*2.00f+ 100*2.50f+(units-150)+fixedrate;

		}
	
	System.out.println("The current bill rs"+amount);
		
	}

	}



