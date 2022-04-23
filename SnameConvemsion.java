package p1;

import java.util.Scanner;

class myclass extends Exception{
	public myclass(String s){
		super(s);
		
	}
}


public class SnameConvemsion {
	public static void main(String[] args) throws myclass {
			String fname=null;
			Scanner sc=new Scanner(System.in);
				System.out.println("Enter a fname");
				fname=sc.nextLine();
				String lname=null;
				
				System.out.println("Enter a lname");
				lname=sc.nextLine();

				try{

				if(fname.equals(" ")&& lname.equals(" ")){
				throw new myclass ("enter ur name");
			}else{
				System.out.println(fname +" " +lname);
			}
		}catch(NullPointerException e){
		e.printStackTrace();
	}
		
	
	
	}
	



	}


