package test;

public class Leaderelement5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 15, 14, 3, 4 };
		iloop(0, a);

	}

	private static void iloop(int i, int[] a) {
		// TODO Auto-generated method stub
		if (i < a.length) {
			int count = 0;
			count = loopj(i, i + 1, count, a);
			if (count == 0)
				System.out.println(a[i] + " ");
			i++;
			iloop(i, a);
		}
	}

	private static int loopj(int i, int j, int count, int[] a) {
		// TODO Auto-generated method stub
		if (j < a.length) {
			if (a[i] < a[j]) {
				count++;
			}
			j++;
			loopj(i, j, count, a);
		}
		return count;
	}

}
