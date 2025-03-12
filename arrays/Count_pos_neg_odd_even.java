package arrays;

public class Count_pos_neg_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { -2, -3, 4, 5, -6 , -7, 9, 8, 11, 12,};
		int p = 0, n = 0, even = 0, odd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {

				p++;

			} else {
				n++;
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			System.out.print(a[i]+" ");
		}
		System.out.println("\npositive number "+p+"\nnegetive number : "+n);
		System.out.println("even number "+even+"\nodd number : "+odd);

	}

}
