package arrays;

public class Shiftingleft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 120, 140, 810, 91, 22, 155, 15, 66, 89 };
		int temp = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];

		}
		a[a.length - 1] = temp;
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");
		}

	}

}
