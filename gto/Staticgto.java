package gto;

public class Staticgto
{
	
		public static void main(String[] args) {
			// code51
			 String input = "+123";
		     myCode(input);
		}
		private static void myCode(String input) {
			
			
		        Byte copy = Byte.valueOf(input);
		        String str = input + " " + copy;
		        System.out.println(str);
		}
	}