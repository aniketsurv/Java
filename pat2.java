import java.util.Scanner;
public class Pat2{
	public static void main(String[]args){
	for(int i=0;i<5;i++){   //row
		for(int j=0;j<5;j++){     //col
			if(j-i>=0)
				System.out.print(" * ");
			else
				System.out.print("   ");
		}
		System.out.println();
	}
	
		}
}
