package string;

public class Example_replace_d_to_f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdefdftdtfdtf";
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == 'd') {
				s2 = s2 + 'f';
			} else {
				s2 = s2 + s1.charAt(i);
			}

		}
		System.out.println(s2);
	}

}
