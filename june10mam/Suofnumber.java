package june10mam;

import java.util.Scanner;

public class Suofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt(),rem,sum=0;
while (0<num) {
	 rem=num%10;
	 sum=sum+rem;
	num=num/10;
	System.out.println(num);
}
System.out.println("sum of number "+sum);
	}

}
