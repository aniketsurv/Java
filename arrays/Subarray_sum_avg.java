package arrays;

public class Subarray_sum_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 7, 90, 20, 5, 50, 40 };
		int k = 3;
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		for (int i = 0; i < a.length - k + 1; i++) {
			int sum = 0;
			for (int j = i; j < i + k; j++) {
				sum = sum + a[j];

			}
			int avg = sum / k;
			if (avg < min) {
				min = avg;
				minIndex = i;
			}
		}
		System.out.println(min);
		System.out.println(minIndex);
		for (int i = minIndex; i < minIndex + k; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
