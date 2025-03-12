package finalkey;
public class Finalkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo ob =new Demo();
		ob.show();
	}
	

}
class Demo extends Test{
	int a=10;
	public Demo() {
		// TODO Auto-generated constructor stub
	}
	
	
	static void show() {
		int a=100;
		System.out.println("hii from demo ");
	}
	
}
class Test{
	
	private void show() {
		// TODO Auto-generated method stub
int b=67;
System.out.println("hii");
	}
	
}