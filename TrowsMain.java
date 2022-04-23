import java.util.Scanner;


public class TrowsMain {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a age");
		int age=sc.nextInt();
		try {
			if(age<18){
				throw new ArithmeticException("not eligible for voting");
			}
		}
catch(ArithmeticException e){
	e.printStackTrace();
}
	}

}
