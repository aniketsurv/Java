package test;

public class Sumandavgofdigonal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 9, 8, 7, 6 }, { 5, 4, 3, 2 } };
		int sum = 0;

		sum = iloop(0, sum, a);

		double avg = sum / count;
		System.out.println(sum + "\n" + avg);
	}

	static int count = 0;

	private static int iloop(int i, int sum, int[][] a) {
		// TODO Auto-generated method stub
		if (i < a.length) {
			sum = jloop(i, 0, sum, a);
			i++;
			return iloop(i, sum, a);
		}
		return sum;
	}

	private static int jloop(int i, int j, int sum, int[][] a) {
		// TODO Auto-generated method stub
		if (j < a.length) {
			if (j + i == a.length - 1) {
				sum = sum + a[i][j];
				count++;
			}
			j++;
			return jloop(i, j, sum, a);
		}
		return sum;
	}

}
