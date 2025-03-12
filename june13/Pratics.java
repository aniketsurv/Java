package june13;

public class Pratics {
//@SuppressWarnings({ "removal", "unused" })
//	public static void main(String[] args) 
//	{
//	int sum=0;
//	for(int i=0,j=0;i<6&j<6;++i,j=i+1)
//		sum+=i;
//	System.out.println(sum);
//	}
	
	
//	static boolean ball;
//	public static void main(String[] args) 
//	{
//		//cos.18
//		short bat = 42;
//        if (bat < 50 & !ball)
//            bat++;
//        if (bat > 50)
//            ;
//        else if (bat > 40) {
//            bat += 7;
//            bat++;
//        }
//        else
//            --bat;
//        System.out.println(bat);
//	}	
//	
	
//	public static void main(String[] args) {
//	      int x = 4;
//        int y = 0;
//        for ( ; y < 10; ++y) 
//        {
//            if (y % x == 0) 
//                continue;  
//            else if (y == 8)
//                 break;
//            else
//               System.out.print(y + " ");
//        }
        
//	public static void main(String[]args ) 
//	{   int num=8;
//        int sum=0;
//        for (int i = 1; i <= num; i++)
//        {
//        	if(num%i==0)
//        		System.out.println(i);
//		}
//		}
	public static void main(String[] args)
	{
		//CS.16
	    int i = 20;  
            myCode(i);
	}	

	private static void myCode(int i) 
	{
		        System.out.print('a');
		        outer : while (3 < 4) {
		            System.out.print('b');
		            do {
		                System.out.print('c');
		                if (i++ > 20)
		                    break outer;
		                if (1 < 2)
		                    break;
		                System.out.print('d');
		            } while (6 > 7);
		            System.out.print('e');
		        }
		        System.out.print('f');
		    }
}
