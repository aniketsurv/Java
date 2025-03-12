package arrays;

public class Oddevenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;

			}
		}
		int[] evenArray = new int[evenCount];
		int[] oddArray = new int[oddCount];
		int evenIndex = 0;
		int oddIndex = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
evenArray[evenIndex++]=a[i];
			} else {
oddArray[oddIndex++]=a[i];
			}
		}
		System.out.println("even array : ");
		for (int i = 0; i < evenArray.length; i++) {
			System.out.print(evenArray[i]+" ");
		}
		System.out.println("\nodd Array : ");
		for (int i = 0; i < oddArray.length; i++) {
			System.out.print(oddArray[i]+" ");
		}
	}

}
