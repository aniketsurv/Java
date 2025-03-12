package arrays;

public class Reverse_array_not_used_thiered_varable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 120, 140, 810, 91, 22, 155, 10, 20, 60, 45, 78, 98 };
		int i = 0;
		int j = a.length - 1;
		while (i < j) {
			a[i] = a[i] + a[j];
			a[j] = a[i] - a[j];
			a[i] = a[i] - a[j];
			i++;
			j--;

		}
		for (int j2 = 0; j2 < a.length; j2++) {
			System.out.print(a[j2] + " ");
		}

	}

}
