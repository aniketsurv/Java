package june21;

public class Char3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i = 0; i < 11; i++) {
	for (int j = 0; j < 6; j++) {
	if (j+i>=10||j-i>=0) {                      //   j-i>=0||j+i>=11 or j+i<=5||j-i<=-5
			System.out.print((char)(65+j));
		} else {
System.out.print(" ");
		}
	}
	System.out.println();
}
	}
}
