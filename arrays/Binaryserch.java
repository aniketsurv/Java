package arrays;

public class Binaryserch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		int element = 12;
		int first = 0;
		int last = a.length - 1;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (element == a[mid]) {
				System.out.println(element + ": found at index : " + mid);
				break;
			} else if (element > a[mid]) {

				first = mid + 1;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
			if (first > last)
				System.out.println("element not found");
		}

	}

}
