import java.util.Scanner;
public class pallno{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
	int num=sc.nextInt(),prevterm=0,currentterm=1,nextterm=0;
	for(int i=0;i<num;i++){
		System.out.print(prevterm+"    ");
		nextterm=prevterm+(2*currentterm);
			//System.out.println(nextterm);
			prevterm=currentterm;
			currentterm=nextterm;
		
	}
	
		}
}
