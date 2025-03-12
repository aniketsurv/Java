package exception_handling;

public class Cheakedexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main in");
m1();
System.out.println("main out");
	}

	private static void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 in");
		try {
			m2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.fillInStackTrace();
			
		}
		
		System.out.println("m1 out");
		
	}

	private static void m2() throws Exception {
		System.out.println("m2 in");
		m3();
		System.out.println("m2 out");	}

	private static void m3() throws Exception{
		// TODO Auto-generated method stub
		System.out.println("m3 in");
		Thread.sleep(1000);
		System.out.println("m3 out");
	}

}
