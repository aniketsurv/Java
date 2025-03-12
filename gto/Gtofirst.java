package gto;

public class Gtofirst
{
	public static void main(String[] args) 
	{
		//CS.23
		int first = 10, second = 30;
        do {
            if (first++ > --second) {
                continue;
            }
          } while (first < 15);
        System.out.println("first = " + first + " and second = " + second); 
	}	
}