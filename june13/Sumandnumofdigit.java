package june13;

public class Sumandnumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=123456789,sum=0,count=0;
while (num>0) {
	sum=sum+num%10;
	num=num/10;
	count++;
	
	
}
System.out.println(sum);
System.out.println(count);
	}

}
