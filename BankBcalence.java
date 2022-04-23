package p1;

import java.util.Scanner;

class BankException extends Exception {
	public BankException(String s) {
		super(s);
	}
}
class Sbi{

	int balance=20000;
	int

	public Sbi(){
	try {
		if(amt>balance){
			throw new BankException("insufficiant balance");
		sdsd

			
		}else{
			balance=balance-amt;
			System.out.println(balance);
		}
	}catch(BankException e){
		e.printStackTrace();
	}
}
}
public class BankBcalence {
	public static void main(String[] args) {
		Sbi ob=new Sbi();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount be draw");
int i=sc.nextInt();
	}

}
