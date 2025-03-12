import java.util.Scanner;
public class harshad{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number :  ");
	int num=sc.nextInt();
	int temp=num;
	
	int rem,sum=0;
	
	
	
	while(0<num){
		
		rem=num%10;
		sum=rem+sum;
		num=num/10;
		
	}
	if(temp%sum==0)
	System.out.println(temp+" is a harshad number");
	else
		System.out.println(temp+" not harshad number");

	
		}
}
