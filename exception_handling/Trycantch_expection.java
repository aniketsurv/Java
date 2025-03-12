package exception_handling;

public class Trycantch_expection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}

	private static void m1() {
		// TODO Auto-generated method stub
		m2();
	}

	private static void m2() {
		// TODO Auto-generated method stub
		System.out.println("s1");
		System.out.println("s2");
		try {
			System.out.println("s3");
			System.out.println(45 / 0);
			System.out.println("s5");
		} catch (ArithmeticException e) {
			// TODO: handle exception

			System.out.println("s6");
		}
		System.out.println("s7");
	}

}
