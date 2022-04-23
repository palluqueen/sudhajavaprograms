package p1;
public class Function {

		//function withno arguments
		//1/2+1/3+1/4+....1/10 series sum
		//0.5+0.333+0.25
		void series() {

		float s=0;
		for(int i=2;i<=10;i++ ){
			s=s+((float)i/i);
		}
		System.out.println("sum="+s);
	}
	
//funtion with one arg
		//1,8,27,64,125
		//0,7,26,63,124......
void series(int p){
	int cube=0;
	for(int i=1;i<=p;i++){
	cube=(i*i*i)-1;
	System.out.print(cube+" ,");
		
	}
	System.out.println();
}
void series(int x, int n){
	float s=0;
	for(int i=1;i<=n;i++){
	s=(float) (s+Math.pow(x, i));
}
	System.out.println("sum="+s);
}


	public static void main(String[] args) {
		
		 Function ob=new  Function();
		 ob.series(8);
		 ob.series();
		 ob.series(2,5);

	}

}
