package june17;

public class Chpat3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				if (j-i<=0&&i+j<=8) {
					System.out.print((char)(j+65));
				} else {
		              System.out.print(" ");
				}
			}
			     System.out.println();
		}
	}

}
