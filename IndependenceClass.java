package Independence;
class MyFirstClass {
	private int pri;//private
	public int pubj; //public
	protected int protk;//prote
	int pdf;//default
	
	

	//with in a package 
	//private is only within a class
	//default public are like public
	//protected inherited can acess directly
	//other class can acess with ref to pbject
	void myFirstClassDisplay(){
		System.out.println("private can acessed"+pri);
		System.out.println("public can acessed"+pubj);
		System.out.println("protected can acessed"+protk);
		System.out.println("default can acessed"+pdf);
	}
}
public class IndependenceClass {

void display(){
	MyFirstClass ob=new  MyFirstClass();
		//System.out.println("private can acessed"+mob.pri);
		
		System.out.println("public can acessed"+ob.pubj);

		System.out.println("protected can acessed"+ob.protk);
         
		System.out.println("default can acessed"+ob.pdf);
}

	
	public static void main(String[] args) {
		
		IndependenceClass ob=new IndependenceClass();
		ob.display();
		
	}

}

