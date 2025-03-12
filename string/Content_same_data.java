package string;

public class Content_same_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Kiran";
		String s2="Kiran";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1==s2);
		
		
		String s3=new String("Kiran");
		String s4=new String("Kiran");
		System.out.println(s3.compareTo(s4));
		System.out.println(s3==s4);
	}

}
