package pattarn;

public class pat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i = 0; i < 9; i++)
{
	if(i<5) 
	{
		
		
		for (int j = 0; j < 5; j++) 
		{
			if(j+i<=4) {
				System.out.print("* ");
			}
			else {
				System.out.print("");
			}
		}
		System.out.println();
	}
	else {
		for (int j = 0; j < 5; j++) 
		{
			if(j-i<=-4) {
				System.out.print("* ");
			}
			else {
				System.out.print("");
			}
		}
		System.out.println();
	}
	
	
}
	}

}
