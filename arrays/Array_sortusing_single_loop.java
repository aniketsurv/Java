package arrays;

public class Array_sortusing_single_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 12, 56, 88, 99, 44, 66, 44 ,1};
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] > a[i + 1]) {
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
			}
		}
		for (int i : a) {
			System.out.print(i+" ");
		}

	}

}
