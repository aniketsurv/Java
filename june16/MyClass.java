package june16;
public class MyClass {

	public static void main(String[] args) 
	{
		//methods21
		int a=4;
		int b=8;
		myCode(a,b);
	}

	private static void myCode(int a,int b) 
	{
	
		if((b-a--)>=a)
		{ 
			if((b+a)%2==1)
				System.out.println(a*b);
			else
				System.out.println(b+a);
		}
	}
	
}