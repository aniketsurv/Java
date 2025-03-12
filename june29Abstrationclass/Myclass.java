package june29Abstrationclass;

public class Myclass extends Employee {

	Myclass(String name, int id,int hra,int da,float basicSalary) {
		super(name, id);
		// TODO Auto-generated constructor stub
		float d=getSalary(hra, da, basicSalary);
		Display(d);}
		@Override
		float getSalary(int hra, int da, float basicSalary) {
			// TODO Auto-generated method stub
			float totalSalary=da+hra+basicSalary;
			return totalSalary;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Myclass m=new Myclass("kiran", 1, 1000, 2000, 100000);

	}

	

	

	

	
	

}
