package p1;
class myclass implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<9;i++){

		System.out.println("inside the class"+Thread.currentThread());
		
	try{
		Thread.sleep(1000);	
	}catch(InterruptedException e){
		e.printStackTrace();
	}
		}
}
}
public class RunnablrMain {
	public static void main(String[] args) throws InterruptedException {
		myclass ob=new myclass();
		Thread tob=new Thread(ob);
		Thread tob1=new Thread(ob);
		tob.setName("t1");
		tob1.setName("t2");
         System.out.println("main class");
		tob.start();
		tob.join();
		tob1.start();

	}

}
