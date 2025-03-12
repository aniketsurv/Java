import java.util.Scanner;
public class power{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter bse : ");
	int base=sc.nextInt();
	System.out.println("Enter exponent : ");
	int exp=sc.nextInt();
	int temp=exp;
	
	int power=1;
	while(exp>0){
		
		
		
		power=power*base;
		exp--;
	}
	System.out.println(base+"raise to power "+temp+" is : "+power);
	
	}
}
