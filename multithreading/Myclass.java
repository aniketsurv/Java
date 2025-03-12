package multithreading;

public class Myclass {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
Mythread t1=new Mythread();
Mythread2 t2=new Mythread2();
t1.start();
t2.start();
Thread.sleep(1000);
System.out.println("by by");
	}

}
