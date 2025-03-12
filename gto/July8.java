package gto;

public class July8 {


	public static void main(String[] args) 
	{
		//BJ.1.0
		int a = 4;
		myCode(a);
		
	}

	public static void myCode(int a) 
	{
		
        a -= 10;
        a = -a;
        a = 7 + a;
        System.out.println("a = " + a );
        a %= a;
        a = a * a - 3 ;
        System.out.println("a = " + a );
	}	
}