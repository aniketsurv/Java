package june16;

public class Pat4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {
				if (j-i<=4&&j+i>=4) {
					System.out.print("*");
				} else {
		System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
