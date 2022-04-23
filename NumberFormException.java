package p1;

public class NumberFormException {
	public static void main(String[] args) {
		String s="sudha";
		try{
		int i=Integer.parseInt(s);
		}catch(NumberFormatException t){
			t.printStackTrace();
		}

	}

}
