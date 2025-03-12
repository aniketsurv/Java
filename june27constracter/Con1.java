package june27constracter;
public class Con1 {
	int num1,num2,result;
	Con1(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
		
//		num1=a;
//		num2=b;
	}
void display() {
	// TODO Auto-generated method stub
result=num1+num2;
System.out.println(result);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Con1 co=new Con1(67,65);
co.display();
	}

}
