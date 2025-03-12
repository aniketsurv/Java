package arrays;

public class Leadernumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 15, 13, 4, 5 };
//for (int i = 0; i < a.length; i++) {
//	int count=0;
//	for (int j = i+1; j < a.length; j++) {
//		if (a[i]<a[j]) {
//			count++;
//		}
//	}
//	if(count==0)
//		System.out.print(" "+a[i]);
//}

		loopi(0, a);

	}

	private static void loopi(int i, int[] a) {
		// TODO Auto-generated method stub
		if (i < a.length) {
			int count = 0;
			count = loopj(i, i+1, a, count);
			if(count==0)
				System.out.println(a[i]+" ");
			i++;
			loopi(i, a);
		}
	}

	private static int loopj(int i, int j, int[] a, int count) {
		// TODO Auto-generated method stub
		if(j<a.length) {
			if(a[i]<a[j])
			count++;
			j++;
		return loopj(i, j, a, count);
		}
		return count;
	}
}
