import java.util.Scanner;
public class Percentage{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first subject marks");
	int sub1=sc.nextInt();
	System.out.println("Enter second subject marks");
	int sub2=sc.nextInt();
	System.out.println("Enter thired subject marks");
	int sub3=sc.nextInt();
	System.out.println("Enter fourth subject marks");
	int sub4=sc.nextInt();
	System.out.println("Enter fifth subject marks");
	int sub5=sc.nextInt();
	
	int totalmark=sub1+sub2+sub3+sub4+sub5;
	System.out.println("total obtained mark : "+totalmark);
	int maxmarks=500;
	
	int percentage=(totalmark*100)/maxmarks;
	System.out.println(" obtained percentage : "+percentage);
	
	if(percentage>=90&&percentage<=100)
	System.out.println("Grade A");
	else if(percentage>=80&&percentage<90)
	System.out.println("Grade B");
else if(percentage>=70&&percentage<80)
	System.out.println("Grade C");
else if(percentage>=60&&percentage<70)
	System.out.println("Grade D");
else if(percentage>=50&&percentage<60)
	System.out.println("Grade E");
else if(percentage>=40&&percentage<50)
	System.out.println("Grade F");
	else 
	System.out.println("Grade g");
	}
}
