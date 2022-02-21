package p1;

import java.util.Scanner;

public class Searching {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int size,search,pos=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter a element"+size);
		for(int i=0;i<size;i++){
			a[i]=sc.nextInt();
			
		}

		System.out.println("enter a search element");
		search =sc.nextInt();
for(int i=0;i<search;i++){
	if(search==a[i]){
		pos=i+1;
		break;
	}
}
if(pos>0){
	System.out.println("element is found"+pos);
	System.out.println("search is unsucess full");


}
	}

}
