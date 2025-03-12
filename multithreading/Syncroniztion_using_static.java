package multithreading;



class Display1 {

synchronized static	void show(int num) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println((num * i) + " " + Thread.currentThread().getName());
		}
	} 
}

class T10 extends Thread {
	

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Display1.show(5);
	}

}
class T11 extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Display1.show(2);
	}

}

public class Syncroniztion_using_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

T10 th1=new T10();
T11 th2=new T11();
th1.start();
th2.start();
	}

}
