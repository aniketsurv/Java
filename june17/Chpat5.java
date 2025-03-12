package june17;

public class Chpat5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			int count=0;
			for (int j = 0; j < 9; j++) {
				
				
				if ((j+i>=4&&j+i<=8)) {                     //(j+i>=4&&j+i<=8)
					System.out.print("*");
				} else {
		              System.out.print(" ");
				}
			}
			     System.out.println();
		}
	}

}
