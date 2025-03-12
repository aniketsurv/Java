package multithreading;

class Choc {

	int ch = 0;

	synchronized void produce(int n) {
		if (ch >= 20) {
			try {
				System.out.println(Thread.currentThread().getName() + " is waiting..");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ch = ch + n;
		System.out.println(Thread.currentThread().getName() + " produce : " + ch);
		notify();
	}

	synchronized void consumer() {
		if (ch <= 6) {
			try {
				System.out.println(Thread.currentThread().getName() + " is waiting..");
				wait();
			} catch (InterruptedException e) {
// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (ch > 6) {
			ch = ch - 6;
		}
		System.out.println(Thread.currentThread().getName() + " remending :  " + ch);
		notify();
	}
}

class producer extends Thread {

	Choc ch;

	public producer(Choc ch) {

		this.ch = ch;
	}

	public void run() {
		int i = 0;
		while (i < 10) {

			ch.produce(10);
			i++;
			if (i > 10) {
				System.out.print("stop");
				System.exit(0);
			}
		}
	}

}

class Consumer extends Thread {

	Choc ch;

	public Consumer(Choc ch) {

		this.ch = ch;
	}

	public void run() {

		while (true) {

			ch.consumer();

		}
	}

}

public class Test_chocklet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Choc ch = new Choc();
		producer p1 = new producer(ch);
		Consumer c1 = new Consumer(ch);
		p1.start();
		c1.start();
	}

}
