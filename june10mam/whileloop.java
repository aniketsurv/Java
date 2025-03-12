package june10mam;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
//		int i=1;
//while (i<=10) {
//	System.out.println(i);
//	i++;
//}
//System.out.println("out of loop");
		
		int S=2;
		int e=10;
		int Sum=0;
		for (int i = S; i <= e; i+=2) {
			
			if(i==8)
				break;
			Sum+=i;
		}
		System.out.println("sum = "+Sum);
	}

}
