package arrays;

public class Saddle_point_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = { { 6, 3, 1 }, { 9, 7, 8 }, { 2, 4, 5 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int count = 0;
				for (int k = 0; k < a.length; k++) {
					if (a[i][j] > a[i][k]) {

						count++;
					}
				}
				if (count == 0) {
					int count2=0;
					for (int k = 0; k < a.length; k++) {
						if (a[i][j] < a[k][j]) {
							count2++;
						}
					}
					if(count2==0)
						System.out.println(a[i][j]);
				}
			}
		}
	}

}
