public class Area{
	
	public static void main(String[]args){
		int num=5;
		
		operation(num);
		
		
	}
	
	public static void operation(int num){
		
		double area=(Math.sqrt(3)/4)*(num*num);
		System.out.println("Area of equilateral triangle"+area);
		
	}
	
}