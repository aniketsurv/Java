package gto;

public class Gto76
//{
    //Arr.17
//	public static void main(String[] args) {
//		int[] a={11,22};
//		printij(a);
//		
//	}//EndOfMainMethod
//
//	private static void printij(int[] a) {
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				System.out.println(a[i]+" "+a[j]);
//			}
//		}
//
//		
//	}
//	public static void main(String[] args) 
//	{
//		//arr.5
//		int a[] = {11, 6, 17, 8, 9, 34, 14};
//        System.out.println(guessWhat(a));
//	}	
//	
//	public static int guessWhat(int arr[])
//    {
//        int x = 0;
//        for (int element : arr)
//        x = x < element ? element : x;
//        return x;
//    
//	}
//}

//{
//	public static void main(String[] args) 
//	{
//		//arr.39
//		 Convert dec = new Convert();
//	        dec.printBinaryFormat(10);
//	}
//}
//
//class Convert {
//
//    public void printBinaryFormat(int dec) {
//        int bin[] = new int[15];
//        int temp = 0;
//        while (dec > 0) {
//            bin[temp++] = dec % 2;
//            dec = dec / 2;
//        }
//        System.out.print("After binary conversion: ");
//        for (int i = temp - 1; i >= 0; i--) {
//            System.out.print(bin[i]);
//        }
//    }
//}


{
	public static void main(String[] args) 
	{
		//meth.6
		 myMethod();
	}
	
	static void myMethod() {
        int x, y;
        x = 5;
        y = 3;
        System.out.print("(" + x + ", " + y + ")");
        points(x, y);
        System.out.print(" (" + x + ", " + y + ")");
    }
    static void points(int x, int y) {
        int xy;
        xy = x;
        x = y;
        y = xy;
        System.out.print(" (" + x + ", " + y + ")");
    }
}