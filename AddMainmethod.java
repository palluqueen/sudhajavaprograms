package p1;
class addtion{
	static int i;
	static int j;
	static int s;
	static {
		i=9;
		j=10;
	}
	
	static void add1(){
		s=i+j;
		System.out.println(s);

	}

}
public class AddMainmethod{
	
	public static void main(String[] args) {
		addtion.add1();
     
	}

}
