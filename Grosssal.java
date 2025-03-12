import java.util.Scanner;
public class Grosssal{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter basic sal");
	int basicsal=sc.nextInt();
	
	int hra=0,da=0,grosssal=0;
	
	if(basicsal<=10000){
		hra=(basicsal*20)/100;
		da=(basicsal*80)/100;
	System.out.println("hra : "+hra);
	System.out.println("da : "+da);
	}
else if(basicsal<=20000&&basicsal>10000){
		hra=(basicsal*25)/100;
		da=(basicsal*90)/100;
	System.out.println("hra : "+hra);
	System.out.println("da : "+da);
	}
	else {
		hra=(basicsal*30)/100;
		da=(basicsal*95)/100;
	System.out.println("hra : "+hra);
	System.out.println("da: "+da);
	}
	
	
	
	grosssal=basicsal+hra+da;
	System.out.println("grosssal is employee : "+grosssal);
	
	}
}
