package june20;

public class Patnum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				
				if (j+i<=4) {                     //(j+i>=4&&j+i<=8)
					System.out.print(i+j+1);
				} else {
		              System.out.print(" ");
				}
			}
			     System.out.println();
		}
	}

}
