package arrays;

public class Elementfound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a  = { 55, 10, 11, 5, 45,12,14,3,59};
		int num=5,count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==num) {
				count++;
				System.out.println(i+": found");
				break;
			}
			
			
		}
		if(count==0)
			System.out.println("Not found");
	}

}
