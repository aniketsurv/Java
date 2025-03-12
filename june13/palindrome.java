package june13;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=12321;
int original=num1;
int num2=0;
while (num1>0) {
	num2=(num2*10)+(num1%10);//num2=num2*10+num1%10;;
	num1/=10;//num1=num1/10;
	
}
if (original==num2) {
	System.out.println("pailndrome");
} else {
System.out.println("not");
}
	}

}
