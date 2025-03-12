package june21;

public class praticsgto {
	final static short i = 2;
    public static int j = 0;
	public static void main(String[] args) 
	{
		//CS.38
		for (int k = 0; k < 3; k++)
        {
            switch (k)
            {
                case i: System.out.print("0 ");
                case i-1: System.out.print("1 ");
                case i-2: System.out.print("2 ");
            }
        }
	}	
	 
    }