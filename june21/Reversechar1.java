package june21;

public class Reversechar1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	counter=0;
for (int i = 0; i < 5; i++) {
	counter=1;
	for (int j = 0; j < 9; j++) {
	if (j+i>=4&&j-i<=4) {                      //   j-i>=0||j+i>=11 or j+i<=5||j-i<=-5
			System.out.print((char)(64+counter));
			if(j<4)
				counter++;
			else
				counter--;
		} else {
               System.out.print(" ");
		}
	}
	System.out.println();
}
	}
}
