package june27constracter;

public class Con2 {
String name;
int id;
float basicsalary;
String city,state;
int hra,da,total;
	public Con2() {
		// TODO Auto-generated constructor stub
		System.out.println("Welcome hefshine");
	}
	Con2(String name,int id,float basicsalary){
		this();
	this.name=name;
	this.id=id;
	this.basicsalary=basicsalary;
	}
	
	Con2(String name,int id,float basicsalary,String city,String state){
		this(name,id,basicsalary);
		this.city=city;
		this.state=state;
		
	}
	Con2(String name,int id,float basicsalary,String city,String state,int hra,int da){
		this(name,id,basicsalary,city, state);
		this.hra=hra;
		this.da=da;
	}
	 void calculate() {
		// TODO Auto-generated method stub
total=(int)basicsalary+hra+da;
	}
	 void m1() {
		// TODO Auto-generated method stub
System.out.println("End of data");
	}
	void display() {
		// TODO Auto-generated method stub
	calculate();

	System.out.println("name : "+this.name);
	System.out.println("id : "+this.id);
	System.out.println("Salary : "+this.basicsalary);
	System.out.println("city : "+this.city);
	System.out.println("State : "+this.state);
	System.out.println("hra : "+hra);
	System.out.println("hra : "+da);
	System.out.println("total salary :: "+total);
	this.m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Con2 co=new Con2("ajit", 1, 10000, "pune", "Mh",1000,1000);
co.display();
Con2 co1=new Con2("kiran", 2, 100000, "pune", "Mh",2000,4000);
co1.display();
Con2 co2=new Con2("yogesh", 2, 1000000, "pune", "Mh",20000,40000);
co2.display();;


	}

}
