package arrays;

import java.util.Arrays;

public class Remove_1_two_times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 1, 1, 1, 1, 2, 3, 4 };
		int[] c = { 1, 2 };
		for (int k = 0; k < c.length; k++) {

			int n = c[k];
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == n)

					count++;

			}
			if (count > 2)
				count = 2;

			int b[] = new int[a.length - count];
			int bindex = 0, removecount = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] != n || removecount >= 2)
					b[bindex++] = a[i];
				else
					removecount++;
			}
			a = b;
		}
		System.out.println(Arrays.toString(a));
	}

}
