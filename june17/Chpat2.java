package june17;

public class Chpat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j-i<=0) {
					System.out.print((char)(65+i));
				} else {
		              System.out.print(" ");
				}
			}
			     System.out.println();
		}
	}

}
