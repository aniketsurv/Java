package june18;

public class Pat3 {
public static void main(String[] args) {
	int count=0;
	
	for (int i = 0; i < 6; i++) {
		int ch=65;
		
		for (int j = 0; j < 6; j++) {
			
			
			if (j+i>=5||j-i>=6) {                     //(j+i>=4&&j+i<=8)
				System.out.print((char)ch+++" ");
			
			} else {
	              System.out.print(" ");
			}
		}
		     System.out.println();
		   
	}
}
}

