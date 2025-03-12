package june18;

public class Pat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 12; i++) {
			char ch=65;
			for (int j = 0; j < 6; j++) {
				
				
				if (j+i<=5||j-i<=-6) {                     //(j+i>=4&&j+i<=8)
					System.out.print(ch++);
				} else {
		              System.out.print(" ");
				}
			}
			     System.out.println();
		}
	}

}
