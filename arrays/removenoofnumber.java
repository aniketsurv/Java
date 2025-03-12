package arrays;

public class removenoofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 11, 22, 33, 44, 55, 66, 77, 88, 99,55 };
		int num = 99;
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==num)
				count++;
		}
		int[] b = new int[a.length - count];
		int bindex = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != num) {
				b[bindex] = a[i];
				bindex++;
			}
		}
		for (int i = 0; i < b.length; i++) {

			System.out.print(b[i] + " ");
		}
//		int[] b = new int[a.length - 1];
//		int bindex = 0;
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] != num) {
//				b[bindex] = a[i];
//				bindex++;
//			}
//		}
//		for (int i = 0; i < b.length; i++) {
//
//			System.out.print(b[i] + " ");
//		}

	}

}
