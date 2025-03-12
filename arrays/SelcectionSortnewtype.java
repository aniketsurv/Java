package arrays;

public class SelcectionSortnewtype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub,
		int a[] = { 1, 55, 20, 98, 99, 66, 44, 56, 75 };
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++)
				if (a[min] > a[j])
					min = j;

			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
