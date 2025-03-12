package twodimentionalarray;

public class sum_of_xtype_digonal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 5, 1, 3 }, { 2, 4, 3}, { 4, 3, 2 } };
		mycode(a);
	}

	private static void mycode(int a[][]) {
int sum=0, count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (j-i==0||j+i==a.length-1) {
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
