import java.util.Scanner;

class transport1{
	String name;
	int w;
	int charge;
	int surcharge;
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name of the customer");
		sc.nextLine();
		System.out.println("enter weight of parcel");
		sc.nextInt();
		

	}
		void calculator() {
			if(w<10) {
				charge=w*25;
			}
			else if(w>10 && w<=30) {
				charge=10*25+(w-10)*25;
			}
			else if(w>30)  {
				charge=10*25+20*20+(w-30)*10;
			
		}
			surcharge=(charge*5)/100;
 		
			}
		
void print(){


System.out.println("name\tweight\tbill amount\tsurcharge");
System.out.println("---------------------------");
System.out.println(name+"\t"+w+"\t"+charge+"\t"+surcharge);



}

	}

public class Transpotrt {


	public static void main(String[] args) {
		transport1 ob=new transport1();
		ob.accept();
		ob.calculator();
		ob.print();
		


	}

}
