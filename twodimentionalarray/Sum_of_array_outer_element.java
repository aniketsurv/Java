package twodimentionalarray;

public class Sum_of_array_outer_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 5, 4, 1, 5 }, { 3, 9, 9, 6 }, { 8, 6, 3, 3 }, { 7, 9, 4, 6, 1 } };
		mycode(a);
	}

	private static void mycode(int a[][]) {
int sum=0, count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == 0 || j == 0 || j == a[0].length - 1 || i == a.length - 1) {
					System.out.print(a[i][j] + " ");
					sum+=a[i][j];
					count++;
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
		System.out.println("sum of outer element : "+sum);
		double avg=((double)sum)/count;
		System.out.println("average of outer element : "+avg);
	}
}
