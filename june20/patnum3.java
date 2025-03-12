package june20;

public class patnum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 10; j++) {
				
				
				if (j-i<=0) {                     //(j+i>=4&&j+i<=8)
					System.out.print(5-j);
				} else if(j+i>=9) {
		              System.out.print(-4+j);
				}
				else {
					System.out.print(" ");
				}
			}
			     System.out.println();
		}
	}

}
