package exception_handling;

public class Unchackedexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main in");
		m1();
		System.out.println("main out");
	}

	private static void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 in");

		m2();

		System.out.println("m1 out");
	}

	private static void m2() {
		System.out.println("m2 in");
		try {
			m3();
		} catch (Exception e) {

		}
		System.out.println("m2 out");
	}

	private static void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 in");
		System.out.println(10 / 0);
		System.out.println("m3 out");
	}

}
