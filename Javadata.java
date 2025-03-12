package oopsjava;

public class Javadata {
	private static void loop() {
		// TODO Auto-generated method stub
    for (int i = 0; i < 10; i++) {
    	for (int j = 10; j >i; j--) {
			System.out.print(" ");
		}
		for (int j = 0; j < i; j++) {
			System.out.print(" *");
		}
		System.out.println(" ");
	}
	}
	public static void main(String[] args) {
		loop();
	}
}
