package recuttion;

public class Pattern_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		loopi(i);
	}

	private static void loopi(int i) {
		// TODO Auto-generated method stub
		if (i < 9) {
			int j = 0;
			loopj(i, j);
			System.out.println();
			i++;
			loopi(i);

		}
	}

	private static void loopj(int i, int j) {
		// TODO Auto-generated method stub
		if (j < 9) {
			if ((j - i >= 0 && j + i <= 8) || (j + i >= 8 && j - i <= 0)) {
				System.out.print("*");
			} else {
				System.out.print(" ");

			}
			j++;
			loopj(i, j);
		}
		
	}

}
