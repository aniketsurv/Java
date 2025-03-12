package arrays;

public class Removenoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		int num = 55;
//for (int i = 0; i < a.length; i++) {
//	if (num!=a[i]) {
//		System.out.print(a[i]+" ");     //techinique 1
//	}
//}
		int[] b = new int[a.length - 1];
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

	}

}
