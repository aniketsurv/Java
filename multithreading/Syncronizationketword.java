package multithreading;

class Display {

synchronized	void show(int num) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			String ajit="ajit";
			Thread.currentThread().setName(ajit);
			System.out.println((num * i) + " " + Thread.currentThread().getName()+" "+num);
		}
	} 
}

class T1 extends Thread {
	Display display;

	public T1(Display display) {

		this.display = display;
	} 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		display.show(5);
	}

}
class T2 extends Thread {
	Display display;

	public T2(Display display) {

		this.display = display;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		display.show(2);
	}

}

public class Syncronizationketword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Display display=new Display();
T1 th1=new T1(display);
T2 th2=new T2(display);
th1.start();
th2.start();
	}

}
