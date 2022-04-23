package p1;

public class MyNum {

	
	public static void main(String[] args) {
		int a[]={1,2,4,5};
		int n=5,s,ar=0;
		s=n*(n+1)/2;
		s=5*(5+1)/2;
		for(int i=0;i<a.length;i++){
			ar=ar+a[i];

		}
	int mn=s-ar;
	System.out.println("missing number= "+mn);
		

}
}