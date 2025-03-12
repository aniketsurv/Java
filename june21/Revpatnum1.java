package june21;

public class Revpatnum1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	counter=0;
for (int i = 0; i < 11; i+=2) {
	counter=1;
	for (int j = 0; j < 11   ; j++) {
	if (j-i<=0) {                      //   j-i>=0||j+i>=11 or j+i<=5||j-i<=-5
			System.out.print(counter+" ");
			if(i>2*j)
				counter++;
			else
				counter--;
		} else {
System.out.print("");
		}
	}
	System.out.println();
}
	}
}
