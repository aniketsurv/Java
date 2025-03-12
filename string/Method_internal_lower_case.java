package string;

public class Method_internal_lower_case {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdegkADJ Ahdjoao";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {

				s1 = s1 + (char) (s.charAt(i) + 32);
			} else {
			
			s1=s1+s.charAt(i);}
		}
		System.out.println(s1);
	}

}
