package arrays;

public class Find_index_min_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 6, 2 };
		int n = 2;
		int m = 6;
		int nindex = 0;
		int mindex = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == m) {
				mindex = i;
				break;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				nindex = i;
				break;
			}
		}
		System.out.println("distance is : " + (mindex - nindex));
	}

}
