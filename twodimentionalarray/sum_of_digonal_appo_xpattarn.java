package twodimentionalarray;

public class sum_of_digonal_appo_xpattarn {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 5, 4, 1 }, { 3, 9, 9 }, { 8, 6, 3 } };
		mycode(a);
	}

	private static void mycode(int a[][]) {
		int sum = 0, count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (j - i == 0 || j + i == a.length - 1) {
					System.out.print("  ");

				} else {
					System.out.print(a[i][j] + " ");
					sum += a[i][j];
					count++;
				}

			}
			System.out.println();
		}
		System.out.println("sum of outer element : " + sum);
		double avg = ((double) sum) / count;
		System.out.println("average of outer element : " + avg);
	}
}
