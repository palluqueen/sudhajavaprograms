package p1;

import java.util.Scanner;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[],temp,i,j,n;
		Scanner sc=new Scanner(System.in);
System.out.println("enter a size of array");
n=sc.nextInt();
a=new int [n];

System.out.println("enter a element");
for(i=0;i<a.length;i++){
a[i]=sc.nextInt();
	}
System.out.println("enter a elements before");
for(i=0;i<a.length;i++){
System.out.println(a[i]);

	}

	for(i=0;i<a.length-1;i++){
		for(j=0;j<a.length-1-i;j++){
			if(a[j]>a[j+1]){
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		
	}
System.out.println("sorted array");

for(i=0;i<a.length;i++){
	System.out.println(a[i]);
	
}
		
}
}
