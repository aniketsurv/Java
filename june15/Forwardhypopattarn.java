package june15;

public class Forwardhypopattarn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				
				if(j+i<4||j+i>4)           //remove slash 1:j+i<=4&&j+i>=4  forwedslash   2:j+i<=4||j+i>=4 all 5*5  
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();}
	}

}
