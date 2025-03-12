package arrays;

public class Array1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int sum=0;
		int[]a  = { 5, 10, 11, 15, 45,12,14,3,55};
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		double age=((double)sum)/a.length;//sum*1.0 using this methode to convert to double
		System.out.println(age);
	}

}
