package oopsjava;

public class New_class {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Study s1=new Study("ajit",25);
//      s1.name="ak";
//      s1.age=25;
      s1.study();
      Study s2=new Study("dny",22);
//      s2.age=25;
//      s2.name="dny";
      s2.study();
	}

}
class Study {
	int age;
	String name;
	Study(String name,int age){
		this.name=name; 
		this.age=age;
	}
	 public  void study() {
		// TODO Auto-generated method stub
      System.out.println("study"+" "+name+" "+age);
      	}
 }
class play{
	public  void playing() {
		// TODO Auto-generated method stub
System.out.println("plying");
	}
}