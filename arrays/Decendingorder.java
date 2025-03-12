package arrays;

public class Decendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 12, 18, 36, 9, 5 };
		//insertion sorting
for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		if (a[i]>a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
for (int i = 0; i < a.length; i++) {
	System.out.print(a[i]+" ");
}

// type second sorting bubble sort algorithm
//		int count = 1;
//		for (int i = 0; i < a.length ; i++) {
//
//			for (int j = 0; j < a.length - count; j++) {
//				if (a[j] > a[j + 1]) {
//					int temp = a[j];
//					a[j] = a[j+1];
//					a[j+1] = temp;
//				}
//
//			}
//			count++;
//		}
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}

		
		
		// third techiniq selection sorting algoritham
//		for (int i = 0; i < a.length; i++) {
//			int min=i;
//		for (int j = i+1; j < a.length; j++) {
//			if (a[min]>a[j]) {
//				min=j;
//			}
//		}
//		int temp=a[i];
//		a[i]=a[min];
//		a[min]=temp;
//	}
//	for (int i = 0; i < a.length; i++) {
//		System.out.print(a[i]+" ");
//	}
	}

}
