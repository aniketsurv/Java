package pratistest;

public class Pat81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 12; i++) {
		int	count=1;
			for (int j = 0; j < 6; j++) {
				if (j+i<=5) {
					System.out.print((char)(70-(j+i)));
					
				} else if (j-i<=-6) {
					System.out.print((char)((i-j)+59));
				}
				
				else {
                    System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
