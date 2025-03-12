package test;

public class Remove1formSecond3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[] = { 1, 2, 4 };
		int a[] = { 1, 1, 1, 1, 1, 2, 2, 3, 4 };
		for(int f=0;f<b.length;f++){
		int n = b[f];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (n == a[i]) {
				count++;
			}
			if (count == 2) {
				break;
			}

		}
		int c[] = new int[a.length - count];
		int k = 0;
		int removecn = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != n || removecn >= 2) {
				c[k++] = a[i];

			} else {
				removecn++;
			}

		}
		a = c;}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
