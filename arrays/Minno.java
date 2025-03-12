package arrays;

public class Minno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {120, 140 ,810 ,91,22,155};
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min)
				min=a[i];
			System.out.println(min);
		}
		System.out.println("Min element in given array is : "+min);
			

	}

}
