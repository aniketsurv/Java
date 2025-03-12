import java.util.Scanner;
public class Addsub{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first no");
	int num1=sc.nextInt();
	System.out.println("Enter second no");
	int num2=sc.nextInt();
	System.out.println("dial 1-add,2-sub,3-mul,4-div");
	int operation=sc.nextInt();
	if(operation==1)
	System.out.println(num1+num2);
	else if(operation==2)
	System.out.println(num1-num2);
else if(operation==3)
	System.out.println(num1*num2);
else if(operation==4)
	System.out.println(num1/num2);
else
	System.out.println("wrong operation enter");
	}
}
