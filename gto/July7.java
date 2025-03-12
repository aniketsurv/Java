package gto;

public class July7 {
	int c;
	public static void main(String[] args) 
	{
		//obj.27
		PrintA a = new PrintA();
        PrintB c = new PrintB();

        System.out.println("printA = " + a.printA);
        System.out.println("printB = " + c.printB);

        System.out.println("c = " + c.c);

	}	
	
}

class PrintA
{
    int printA;
}

class PrintB
{
    int printB = 5;
    int c;
}