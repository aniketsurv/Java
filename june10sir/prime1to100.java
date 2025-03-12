package june10sir;

public class prime1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	for (int i = 2; i < 100; i++) {
		
		 int divisiblecount=0;
		  
		  for (int j = 2; j < i; j++) {
			if(i%j==0)
				divisiblecount++;
		}
		  if(divisiblecount==0)
			  System.out.println("prime "+i);
		  else {
			System.out.println("not prime "+i);
		}
		
		
		
		
		
		
		
	}
	
	
	
	}}


