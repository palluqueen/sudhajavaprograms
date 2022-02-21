package p1;

import java.util.Scanner;

public class CountElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int size,search,count=0;
		int a[];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size");
		size=sc.nextInt();
		a=new int[size];
		System.out.println("enter a size"+size);
		for(int i=0;i<size;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("enter a search element");
		search=sc.nextInt();
		 for(int i=0;i<size;i++){
			 count=count+1;
			 
		 }

	
if(count==0){
	System.out.println("not found");
}
	else {
		System.out.println("element found"+count);

	}

}
}
