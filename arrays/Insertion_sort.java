package arrays;

import java.util.Arrays;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 7, 88, 19, 33, 55, 19, 44, 56, 89, 66, 67, 100 };
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			int j = i - 1;
			for (; j >= 0; j--) {
				if (a[i] > a[j])
					break;
			}
			int temp = a[i];
			for (int k = i; k > j + 1; k--) {
				a[k] = a[k - 1];

			}
			a[j + 1] = temp;

		}
		System.out.println(Arrays.toString(a));
	}

}
