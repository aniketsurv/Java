package june13;

import java.util.Scanner;

public class Case_of_prime_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
while(true) {
	System.out.println("enter option 1:prime 2: even 3:odd 4:break");
	int option=sc.nextInt();
	if(option==4)
		break;
	System.out.println("enter start number:");
	int start=sc.nextInt();
	System.out.println("enter end number");
	int end=sc.nextInt();
	if(option==1)
	{
		for (int i=start = 0; i < end; i++) {
			int num=i;
			int count=0;
			for (int j = 2; j < num; j++) {
				if(num%j==0)
					count++;
				
			}
			if(count==0)
				System.out.println(num);
		}
	}
	
	if(option==2) {
		for (int i=start = 0; i < end; i++) {
			
	if(i%2==0)
		System.out.println(i);
	
}}

	if(option==3) {
		for (int i=start = 0; i < end; i++) {
			
	if(i%2!=0)
		System.out.println(i);
	
}}






}
	}

}
