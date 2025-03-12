package june24;

import java.util.Scanner;

public class Employee {
	int id,sal,yearofservices,bonus,total;
	String name;
   void enteremployeedata() {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter name employee");
name=sc.nextLine();
System.out.println("enter salary");
sal=sc.nextInt();
System.out.println("id");
id=sc.nextInt();
System.out.println("enter yearof services");
yearofservices=sc.nextInt();

	}
	 void display() {
		// TODO Auto-generated method stub
System.out.println("id "+id+"employee  name : "+name+" sal : "+sal+" year of services :"+yearofservices+" total sal : "+total);
	}
	  void calbonus() {
		// TODO Auto-generated method stub
if(yearofservices>5) {
	bonus=(int) (sal*0.35);
	total=sal+bonus;
}else{
	bonus=(int) (sal*0.35);
	total=sal+bonus;
}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.enteremployeedata();
		e.calbonus();
		e.display();
		
	}

}
