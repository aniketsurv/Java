package string;

public class Concat_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Welcome ";
		String s2="to java world";
		System.out.println(s1.concat(s2));
		String s3=s1.concat(s2);
		s1=s1.concat(s2);
		System.out.println(s3);
		System.out.println(s1);
				
	}

}
