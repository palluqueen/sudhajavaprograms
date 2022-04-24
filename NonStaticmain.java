package p1;

class Addition {

static int i;
static int j;
static int s;
int n,m,s1;
  Addition(int p,int q) {	
	m=p;
	n=q;
	
}
static {
	i=9;
	j=10;
}
static  void add() {
	s=i+j;
	System.out.println(s);

}
void nonstaticAddition(){
	s1=m+n;
	System.out.println(s1);
}
}
public class NonStaticmain {

	public static void main(String[] args) {
		Addition.add();
		Addition ob=new Addition(3,4);
		Addition ob1=new Addition(4,5);
		ob.nonstaticAddition();
        ob1.nonstaticAddition();

	


	}

}
