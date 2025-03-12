package gto;

public class Gtomul {
//	public static void main(String[] args) {
//		// code49
//		int a = 106, b = 2, c = 69;
//	     myCode(a,b,c);
//	}
//	private static void myCode(int a,int b,int c) {
//		
//		 
//	        double s = .5 * (a + b + c);
//	        int area = (int) Math.sqrt(s * (s - a) * (s - b) * (s - c));
//	        int x = ((area * 9) + 1);
//	        System.out.print(area + " - " + x);
//		
//	}
	
//	public static void main(String[] args) 
//	{
//		//CS.79
//		int num1 = 0;
//        int num2 = 0;
//        for (int i = 0; i < 8; i++) {
//            if ((++num1 > 5) && (++num2 > 4)) {
//                num1++;
//            }
//        }
//        System.out.println(num1 + " and " + num2);
//	}
//}
	public static void main(String[] args) 
	{
		//inheri.11
		 new A1(3);
	        new B1(9, 8);
	        new B1(6, 7).C(1, 2, 3);
	        new C1(3, 5, 2).B(4, 5);
	        new C1(1, 1, 1);
	}
}

class A1 {
    A1(int i) {    print(i * 2);    }
    void print(int i) {    System.out.print(i + " ");    }
}
class B1 extends A1 {
    B1(int j, int k) {
        super(j);
        print(k * 4);
    }
    void C(int j, int k, int l) {    print(j + k + l - 3);    }
}
class C1 extends B1 {
    C1(int j, int k, int l) {
        super(j, k);
        print(l - 3);
    }
    void B(int i, int k) {    print(i * 6);    }
}