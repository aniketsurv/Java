package june21;

public class Char1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i = 0; i < 6; i++) {
	for (int j = 0; j < 6; j++) {
		if (j+i<=5) {
			System.out.print((char)(65+j));
		} else {
System.out.print(" ");
		}
	}
	System.out.println();
}
	}

}
