package p1;

import java.util.Scanner;

class  checked extends Exception{
	public checked(String s){
		super(s);
	}
}

public class MainClass {

	
	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a age");
		age=sc.nextInt();
		try{
			if(age<18) {
				throw new checked("not eligible for vote");
				
			}else{
				System.out.println("you can vote");
			}
		}catch(checked e){
			e.printStackTrace();
		}

	}

}
