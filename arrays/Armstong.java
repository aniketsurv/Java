package arrays;

public class Armstong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=371;
		int sum=0;
		int final3=0;
		while (num>0) {
			sum=num%10;
			final3=final3+sum*sum*sum;
			
			num=num/10;
		}
		System.out.println(final3);

	}

}
