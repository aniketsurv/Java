package june16;

public class Pat111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j-i<=0) {
					System.out.print(5-j);
				} else {
					System.out.print(5-i);
				}
			}
			System.out.println();
		}
	}

}
