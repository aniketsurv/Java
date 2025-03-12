package gto;

import java.util.*;
public class Gtoivalu
{
	public static void main(String[] args) 
	{
		//CS.34
		 int I = 0;
	        outer:
	            while (true)
	            {
	                I++;
	                
	                inner:
	                    for (int i = 0; i < 10; i++)
	                    {
	                        I += i;
	            
	                        if (i == 0 || i == 1 || i == 2 || i == 3)
	                            continue inner;
	                        break outer;
	                    }
	                    continue outer;
	            }
	            System.out.println(I);
	}	
	 
}