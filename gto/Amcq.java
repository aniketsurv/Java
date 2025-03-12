package gto;

import java.util.*;
public class Amcq{
	
	public static void main(String[] args) 
	{
		//CS.3
		int num=10;
		myCode(num);
		
	}

	public static void myCode(int num) 
	{
		int n = 0;
        int sum = 0;

        int count = 10;

        while( n <= num )
        {
            sum += (n * 2);

            if( count < 7 )
            {
                break;
            }
            count--;
            n++;

            if( n % 2 == 0 )
            {
                sum = sum * 3;
            }
        }

        System.out.println("sum = " + sum);

	}	
}