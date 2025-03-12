import java.util.Scanner;
public class Findgraterno{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first no");
	int num1=sc.nextInt();
	System.out.println("enter second no");
	int num2=sc.nextInt();
	
	if(num1>num2){
		
		System.out.println(num1+"is greter than "+num2);
	}
	
	else{
		
		
		System.out.println(num2+"greter than no"+num1);
	}
	
	}
}
