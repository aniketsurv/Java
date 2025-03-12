import java.util.Scanner;
public class Posneg{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter  no");
	int num1=sc.nextInt();
	if(num1>0){
	
	System.out.println(num1+" is positive");
	
	}
	
	else if(0>num1)

		{
			
			System.out.println(num1+"no is negitive");
}
else{
	System.out.println("no is zero");
}
	}
}
