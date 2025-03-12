package twodimentionalarray;

public class Sum_of_array_inner_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3 ,4}, { 4, 5, 6,7 }, { 7, 8, 9 ,10},{11,12,13,14} };
		int sum = 0,cnt=0;
		for (int i = 1; i < a.length-1; i++) {
			for (int j = 1; j < a.length-1; j++) {
				sum=sum+a[i][j];
				cnt++;
			}

		}
		System.out.println("sum of inner element : "+sum);
		int avg=sum/cnt;
		System.out.println("average of inner element : "+avg);

	}

}
