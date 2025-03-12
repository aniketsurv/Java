package string;

public class Example_remove_spacific_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdrfdb";
		String s2 = "";
		char ch = 'b';
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ch) {
				s2 = s2 + s1.charAt(i);
			}
		}
		System.out.println(s2);

	}

}
