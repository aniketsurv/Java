package june28;

public class In1classa {

	 void m1() {
		// TODO Auto-generated method stub
System.out.println("good morinhg...");
	}
}
class Inclas extends In1classa{
	
	
	
	
	 void m1() {
		// TODO Auto-generated method stub
		 super.m1();
System.out.println("class two..");
	}
}
class test{
	public static void main(String[] args) {
		Inclas in=new Inclas();
		in.m1();
		
	}
}