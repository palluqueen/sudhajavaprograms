


public class ErrorDisplay {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		int ar[]=new int[3];
		System.out.println("before division");
		try {
			c=a/b;
	}
		catch(ArithmeticException ex) {
	          ex.printStackTrace();
		}
		
		System.out.println("after division");

	
     try  {
    	 ar[3]=89;
    	 
     }
    	catch(ArrayIndexOutOfBoundsException e) {
	          e.printStackTrace();

    }
     finally {
 		System.out.println("Finally always excecute");
		System.out.println("finally block used to close resource data base and network");
	 
     }
		System.out.println("after catch");

}
	
}	
