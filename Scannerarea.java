import java.util.Scanner;
public class Scannerarea{
	
	
	
	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of l");
		int l=sc.nextInt();
		System.out.println("enter value of b");
		int b=sc.nextInt();
		area(l,b);
	}
	
	public static void area(int l,int b){
		int area=l*b;
		System.out.println("area is: "+area);
		
		
	}
}