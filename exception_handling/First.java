package exception_handling;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}

	private static void m1() {
		// TODO Auto-generated method stub
		m2();
	}

	private static void m2()  {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int a[] = { 1, 2, 3, 4, 5 };
		try {
			System.out.println(a[5]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("handel");
		}
		System.out.println("exit");
	}

}
