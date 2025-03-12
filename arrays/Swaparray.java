
package arrays;
import java.applet.*;
public class Swaparray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 120, 140, 810, 91, 22, 155 };
		int i = 0;
		int j = a.length - 1;
		while (i < j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			j--;
			i++;

		}
		for (int j2 = 0; j2 < a.length; j2++) {
			System.out.print(a[j2]+" ");
		}

	}

}
