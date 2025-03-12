import java.util.Scanner;
public class Threenogre{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first no");
	int num1=sc.nextInt();
	System.out.println("enter second no");
	int num2=sc.nextInt();
	System.out.println("enter thired no");
	int num3=sc.nextInt();
	if((num1>num2)&&(num1>num3)){
		
		System.out.println(num1+"is greter than "+num2+"and"+num3);
	}
	else if(num2>num1&&(num2>num3)){
		
		System.out.println(num2+"is greter than "+num1+"and"+num3);
	}
	else{
		
		
		System.out.println(num3+"greter no than no"+num1+"and"+num2);
	}
	
	}
}
