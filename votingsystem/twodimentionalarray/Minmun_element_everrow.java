package twodimentionalarray;

public class Minmun_element_everrow {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 5, 4, 1 }, { 3, 9, 9 }, { 8, 6, 3 } };
		mycode(a);
	}

	private static void mycode(int a[][]) {

		for (int i = 0; i < a.length; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < a.length; j++) {
				if (a[j][i] < min) {
					min = a[j][i];
				}

			}
			System.out.println("row no : "+i+"  minimum value : "+min);
		}

	}

}
