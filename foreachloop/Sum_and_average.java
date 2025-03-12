package foreachloop;

public class Sum_and_average {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a[]= {1,2,3,4,5,6,7,8,9,9,8,7,0,6,5,4,3,2,1};
//		int sum=0;
//		for (int i : a) {
//			sum=sum+i;
//			System.out.print(i+" ");
//			
//		}
//	System.out.println("\n"+sum);
		int [][]a= {{1,2,3},{1,2,3}};
		for (int[] is : a) {
			for (int is2 : is) {
				System.out.print(is2);
			}
			System.out.println();
		}
	}

}
