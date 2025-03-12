package recuttion;

public class print_1to_10_number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		print(i);
	}

	private static void print(int i) {
		// TODO Auto-generated method stub
		if (i <= 10) {

			System.out.println(i);
			i++;
			print(i);
		}
	}
}
