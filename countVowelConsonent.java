package p1;

public class countVowelConsonent {

	
	public static void main(String[] args) {
		String s="eudbrige india";
		int vcount=0;
		int ccount=0;
		for(int i=0;i<s.length();i++){
	 char ch=s.charAt(i);
	 if(ch=='a' ||ch=='e' ||ch=='i'||ch=='o'||ch=='u'){
		 vcount ++;
	 }else if(ch!=' '){
		 ccount ++;
		 
	 }
		}	
System.out.println("number of voewls is="+vcount);
System.out.println("number of consonents is="+ccount);


	}

}
