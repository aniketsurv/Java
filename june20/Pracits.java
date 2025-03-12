package june20;

public class Pracits {


	public static void main(String[] args) 
	{   

		int i = 65;
	     myCode(i);
	}
	//EndOfMainMethod
	private static void myCode(int i)
	{  
		
		 loop: for(i=0; i < 6; i++) 
		    {
		      if(i % 2 == 0) 
		      {
		        System.out.println("In if block :: " + i);
		        continue loop;
		      } 
		      else
		      {
		        System.out.println("In else block :: " + i);
		      }
		    }
	}
	
	}


