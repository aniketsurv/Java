package june10mam;

import java.util.Scanner;

public class Factorialnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
long num=sc.nextLong(),fact=1;
//for (int i = 1; i <= num;i++ ) {
//	fact=fact*i;
//}
//System.out.println("factorial of "+num+":"+fact);

for (long i = num; 1 <=i ; i--) {
	fact=fact*i;
	
}
System.out.println("decrement fact "+fact);
	}

}
