package twodimentionalarray;

public class Min_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 5, 4, 1 }, { 3, 9, 9 }, { 8, 6, 3 } };
		mycode(a);
	}

	private static void mycode(int a[][]) {

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] < min) {
				
				min=a[i][j];
				}
			}
		}

		System.out.println("min element in matrix: "+min);
	}

}
