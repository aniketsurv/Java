package test;

public class Pattern8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		loopi(0, 5);
	}

	private static void loopi(int i, int irange) {
		// TODO Auto-generated method stub
		if (i < irange) {
			jloop(i, 0, 5);
			System.out.println();
			i++;
			loopi(i, irange);
		}
	}

	private static void jloop(int i, int j, int jrange) {
		// TODO Auto-generated method stub
		if (j < jrange) {
			if(j+i<=4)
			System.out.print(j+i+1);
			else
				System.out.print(" ");
			j++;
			jloop(i, j, jrange);
		}
	}
}
