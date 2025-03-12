package recuttion;

public class Array_sum_using_return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {1,2,4};
int i=0;
int sum=0;
sum=arraysum(a,sum,i);
System.out.println(sum);
	}

	private static int arraysum(int []a, int sum, int i) {
		if (i<a.length) {
			sum=sum+a[i];
			i++;
			return arraysum(a, sum, i);
		}
		return sum;
	}

}
