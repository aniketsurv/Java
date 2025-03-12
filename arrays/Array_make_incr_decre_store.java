package arrays;

public class Array_make_incr_decre_store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 1, 3, 6, 8, 2, 9, 0, 10 };
		int inc[] = new int[a.length];
		int dec[] = new int[a.length];
		int incv = 0;
		int decv = 0;
		if (a[0] > a[1]) {
			dec[0] = a[0];
			inc[0] = a[1];
			incv = a[1];
			decv = a[0];

		} else {
			dec[0] = a[1];
			inc[0] = a[0];
			incv = a[0];
			decv = a[1];
		}
int k=1,l=1;
		for (int i = 2; i < a.length; i++) {
			if (a[i]>incv ) {
				inc[k++]=a[i];
				incv=a[i];
			}
			else if(a[i]<decv){
				dec[l++]=a[i];
				decv=a[i];
			}
			else {
				System.out.println(-1);
				System.exit(0);
			}
		}
		for (int i : dec) {
			System.out.print(i+" ");
		}
		
	}

}
