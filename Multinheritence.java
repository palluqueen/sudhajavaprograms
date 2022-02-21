class one {
	one(){
		System.out.println("one paremt class");
	}
}
class two extends one {
	two() {
		System.out.println("one child class");

	}}
class three extends two {
	three() {
		System.out.println("second paremt class");

	}
}
class four extends three{
	four() {
		System.out.println("third paremt class");

	}
}
public class Multinheritence {


	public static void main(String[] args) {
		four ob=new four();

	}

}
