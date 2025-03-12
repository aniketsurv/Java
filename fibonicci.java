import java.util.Scanner;
public class fibonicci{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number upto which you want to print the series :  ");
	int num=sc.nextInt();
	
	
	long firstnum=0,secnum=1;
	long nextnum=0;
	while(0<num){
		
		System.out.print(firstnum +"  ");
		nextnum=firstnum+secnum;
		firstnum=secnum;
		secnum=nextnum;
		num--;
		
	}
	
		}
}
