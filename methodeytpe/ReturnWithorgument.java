package methodeytpe;

public class ReturnWithorgument {
	
	
	int sum(int num1,int num2) {
		// TODO Auto-generated method stub
int result;
result=num1+num2;
return result;
	}
	void display(int result) {
		// TODO Auto-generated method stub
System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ReturnWithorgument or=new ReturnWithorgument();
int result=or.sum(100, 200);
or.display(result);
	}

}
