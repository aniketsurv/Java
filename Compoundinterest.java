import java.util.*;
public class Compoundinterest{
	
	public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Principal");
		int p=sc.nextInt();
        System.out.println("enter rate of interest");
		double r=sc.nextDouble();
        System.out.println("enter number of times inteest applied per times period");
		int n=sc.nextInt();
        System.out.println("enter number of times periods elapsed");
		int t=sc.nextInt();
		double firstpart=(1+r/n);
		double secondpart=(n*t);
		double amt=p*Math.pow(firstpart,secondpart);
		System.out.println("compound interest: "+amt);
	}
	
	
	
}