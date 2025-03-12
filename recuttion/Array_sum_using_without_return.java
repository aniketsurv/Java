package recuttion;

public class Array_sum_using_without_return {
static int sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,2,4};
int i=0;
printarray(a,i);
System.out.println("\nSum of array : "+sum);
	}

	private static void printarray(int[] a, int i) {
		// TODO Auto-generated method stub
		if (i<a.length) {
			System.out.print(a[i]+" ");
			sum=sum+a[i];
			i++;
			printarray(a, i);
		}
	}

}
