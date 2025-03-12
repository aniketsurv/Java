package arrays;

public class Binarserchrecurtion {
	public static void main(String[] args) {

		int a[] = { 15, 8, 9, 66, 77, 88, 95, 99 };
		int mid = 0;
		int start = 0;
		int end = a.length - 1;
		int num = 77;
		iloop(a, mid, num, start, end);
	}

	private static void iloop(int[] a, int mid, int num, int start, int end) {
		// TODO Auto-generated method stub
		if (start <= end) {
			mid = (start + end) / 2;
			if (num == a[mid]) {
				System.out.println("index " + mid);
				return;
			} else if (a[mid] < num) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

			iloop(a, mid, num, start, end);
		}
	}
}
