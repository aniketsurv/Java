package arrays;

public class Basic_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 33, 78, 55, 26, 99, 95 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
		}
		for(int i:a)
		System.out.print(i+" ");
	}

}
