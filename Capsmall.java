import java.util.Scanner;
public class Capsmall{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter character or number");
	char ch=sc.next().charAt(0);
	if(ch>='A'&&ch<='Z')
	System.out.println("Capital char");
	else if(ch>='a'&&ch<='z')
	System.out.println("small char");
	else if(ch>='0'&&ch<='9')
	System.out.println("number");
else
	System.out.println("Symbol");
	}
}
