package multithreading;

public class Mythread2 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("t2 hello");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {

			}
		}
	}
}
