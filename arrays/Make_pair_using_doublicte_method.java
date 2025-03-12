package arrays;

public class Make_pair_using_doublicte_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 1,};
//get count to create array in next to remove a duplicate in a arrray
		int count1 = 0;
		for (int i = 0; i < a.length; i++) {
			int count2 = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count2++;
					break;
				}
				
			}
			if (count2 == 0)
				count1++;
		}

		int[] b = new int[count1];
		int k=0;
		for (int i = 0; i < a.length; i++) {
			int cnt = 0;
			for (int j = i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					cnt++;
					break;
				}
			}
			if (cnt == 0) {
				b[k++]=a[i];
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.println("("+b[i]+", "+b[j]+")");
			}
		}
	}

}
