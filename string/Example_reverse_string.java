package string;

public class Example_reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String s="You all are very very good student";
		String[] sa=s.split(" ");
		
		
//		for (int i =sa.length-1; i >= 0; i--) {
//			System.out.print(sa[i]+" ");
//		}
		
		int start=0;
		int end=sa.length-1;
		while(start<end) {
			String temp=sa[start];
			sa[start]=sa[end];
			sa[end]=temp;
			start++;
			end--;
			
		}
		for (int i = 0; i < sa.length; i++) {
			System.out.print(sa[i]+" ");
		}
		
		
		
	}

}
