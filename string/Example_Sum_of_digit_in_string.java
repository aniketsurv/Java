 package string;

public class Example_Sum_of_digit_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="012345p";
int sum=0;
for (int i = 0; i < s.length(); i++) {
	char ch=s.charAt(i);
	if(ch>='0'&&ch<='9') {
	sum=sum+(ch-48);}
}
System.out.println(sum);

	}

}
