package p1;

public class muliplecatch {
	public static void main(String[] args) {
		int a=10,b=0,c=0;
		int e[]=new int[5];
		System.out.println("before");
		try{
			 e[6]=12;//arrayindexoutofbound
			 c=a/b;//arthmeticexveption
		}
		catch(ArrayIndexOutOfBoundsException o){
			o.printStackTrace();
		}
		catch(ArithmeticException o){
			o.printStackTrace();
		}
System.out.println("if first statement is error then second statement will not execute");
	}

}
