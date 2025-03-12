package arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Arraysordusingcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 3, 44, 99, 33, 77, 98, 21, 20 };

		for (int i = 0; i < a.length-1; i++)
			for (int j = i+1; j < a.length-1; j++)

				if (a[j] > a[j + 1])
					System.out.println("run");
//else
//	System.out.println("enete");
				else if (a[j + 1] > a[j + 2])
					System.out.print("");
	}

}
