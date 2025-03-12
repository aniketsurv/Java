package arrays;

public class Removeduplicate {
	public static void main(String[] args) {
		int[] a = { 1, 7, 6, 2, 3, 1, 2, 3, 5, 7, 5, 7 };
		int cn = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1+i; j < a.length; j++) {
				if (a[i] == a[j]) {
					cn++;
					break;

				}
			}
		}
		int[] b = new int[a.length - cn];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					break;
				}
			}
			if (count == 0) {
				b[k++] = a[i];

			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}

	}
}
