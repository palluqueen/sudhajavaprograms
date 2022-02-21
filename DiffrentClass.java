  class five {
	five(){
		System.out.println("one paremt class");
	}
}
class six extends five {
	six() {
		System.out.println("one child class");

	}}
class seven extends five{
	seven() {
		System.out.println("second paremt class");

	}
}
class eight extends five{
	eight() {
		System.out.println("third paremt class");

	}
}


public class DiffrentClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		eight ob=new eight ();


	}

}
