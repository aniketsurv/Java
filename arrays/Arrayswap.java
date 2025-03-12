package arrays;

public class Arrayswap {

	public static void main(String[] args) {
		//  
		int[]a  = { 55, 10, 11, 5, 45,12,14,3,59};
		int []b =new int [a.length];
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+"  ");
			}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			b[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
			
	}

}
