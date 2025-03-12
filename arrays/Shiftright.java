package arrays;

import java.util.Arrays;

public class Shiftright {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint 
		int a[]= {10,2,03,05,55,66,44,90};
		int temp=a[a.length-1];
		for (int i = a.length-1;i>0; i--) {
			a[i]=a[i-1];
		}
		a[0]=temp;
		System.out.println(Arrays.toString(a));
	}

}
