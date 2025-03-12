package june18;

public class Pat2 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int count=0;
			
			for (int i = 0; i < 12; i++) {
				int ch=70+count;
				
				for (int j = 0; j < 6; j++) {
					
					
					if (j+i<=5||j-i<=-6) {                     //(j+i>=4&&j+i<=8)
						System.out.print((char)ch--);
					} else {
			              System.out.print(" ");
					}
				}
				     System.out.println();
				    if(i<5)
				    	count--;
				    
				    else
				    	count++;
				    if(i==5)
				    	count=count-1;
			}
	}

}
