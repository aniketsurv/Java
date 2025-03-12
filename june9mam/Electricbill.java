package june9mam;

import java.util.Scanner;

public class Electricbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner Sc=new Scanner(System.in);
   System.out.println("enter the units : ");
   int units=Sc.nextInt();
   
    double bill;
    if (units<=50) {
		bill=units*0.50;
	} else if(units>50&&units<=150) {
 bill=(50*0.50)+((units-50)*0.75);
	}
	else if (units>150&&units<=250) {
		bill=(50*0.50)+(100+0.75)+((units-150)*1.20);
	}
	else {
		bill=(50*0.50)+(100+0.75)+(100*1.20)+((units-250)*1.50);
	
	}
    double surcharge=bill*0.20;
    double finalbill=bill+surcharge;
    System.out.println("units consumed : "+units);
    System.out.println("surcharge added : "+surcharge);
    System.out.println("total bill : "+finalbill);
	}

}
