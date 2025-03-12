package multithreading;

public class Mythread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("t1 hi");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
