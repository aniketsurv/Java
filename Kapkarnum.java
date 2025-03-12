import java.util.Scanner;
public class Kapkarnum{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number :  ");
	int num=sc.nextInt();
	int temp=num;
	
	int sqr=num*num,count=0,left=0,right=0;

	
	while(0<temp){
		
	
		temp=temp/10;
		count++;
		
		
	}
	int div=(int)Math.pow(10,count);
	left=sqr%div;
	right=sqr/div;
	int sum=left+right;
	if(sum==num)
	System.out.println("the number is a kaprekar number ");
	else
		System.out.println("the given number is not kaprekar number");

	
		}
}
