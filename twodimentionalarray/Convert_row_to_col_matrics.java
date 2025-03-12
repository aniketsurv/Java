package twodimentionalarray;

public class Convert_row_to_col_matrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 5, 4, 1 },
				      { 3, 9, 9 },
				      { 8, 6, 3 } };
		mycode(a);
	}
	private  static void mycode(int a[][]) {
		// TODO Auto-generated method stub
		int b[][] = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				b[j][i] = a[i][j];
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}

}
