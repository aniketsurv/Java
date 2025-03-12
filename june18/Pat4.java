package june18;

public class Pat4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		
		for (int i = 0; i < 5; i++) {
			int ch=65,co=0;
			
			for (int j = 0; j < 9; j++) {
				
				
				if (j-i<=count) {                     //(j+i>=4&&j+i<=8)
					System.out.print((char)ch);
				
				} else {
		              System.out.print(" ");
				}
				if (j+1<=i)
					ch++;
				else
					ch--;
			}
			     System.out.println();
			     
			    	 
			     count++;
			   
		}
	}

}
