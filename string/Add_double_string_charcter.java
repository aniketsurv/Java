package string;

public class Add_double_string_charcter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HEFSHINE";
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			s1=s1+ch+ch+ch;
		}
		System.out.println(s1);
	}

}
