package votingsystem;

import java.util.Scanner;



interface voting{
	
	void registerUser(int age);
	void requestUser();
	
}
class Kids implements voting{
String user;
	@Override
	public void registerUser(int age) {
		// TODO Auto-generated method stub
		if(age<=12) {
			user="kids";
			System.out.println("rigester of voting");
		}
		else {
			user = "Adults";
			System.out.println("no");
		}
		requestUser();
	}

	@Override
	public void requestUser() {
		// TODO Auto-generated method stub
		if (user.equalsIgnoreCase("kids")) {
			System.out.println("not eligeble to voting process");
		} else {
System.out.println("no1");
		}
	}}
class Adults implements voting{String user;
@Override
public void registerUser(int age) {
	// TODO Auto-generated method stub
	if(age>12) {
		user="Adults";
		System.out.println("Sucessfully Register as Adults");
	}
	else {
		user = "kids";
		System.out.println("no");
	}
	requestUser();
}

@Override
public void requestUser() {
	// TODO Auto-generated method stub
	if (user.equalsIgnoreCase("Adults")) {
		System.out.println("votting id will be generated.. ");
	} else {
System.out.println("sorry...");
	}
}}



public class V {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter your age");
Scanner sc1=new Scanner(System.in);
int var=sc1.nextInt();
if(var<=12) {
	Kids k=new Kids();
	k.registerUser(var);
}else {
	Adults a=new Adults();
	a.registerUser(var);
}
	}

}
