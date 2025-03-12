package june29Abstrationclass;

public abstract class Employee {
	String name;
	int id;
	Employee(String name,int id){
		
	this.name=name;
	this.id=id;
		
		
	}
	
	 abstract float getSalary(int hra,int da,float basicSalary) ;
		// TODO Auto-generated method stub

	public void Display(float totalSalary) {
		// TODO Auto-generated method stub
System.out.println("employee name : "+name);
System.out.println(" employee id : "+id);
System.out.println("employee total Salary :"+totalSalary);

	}
	

}
