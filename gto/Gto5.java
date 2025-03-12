package gto;

public class Gto5 {

	public static void main(String[] args) {
		// inheri.3
		A a = new A();
		a.i = 30;
		B b = new B();
		b.j = 10;
		printI(a);
		printI(b); // LINE X
		printJ(b);
	}

	public static void printI(A a1) {
		System.out.println(a1.i);
	}

	public static void printJ(B b1) {
		System.out.println(b1.j);
	}
}

class A {
	int i;
}

class B extends A {
	int j;
}