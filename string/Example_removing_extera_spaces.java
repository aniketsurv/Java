package string;

public class Example_removing_extera_spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "     welcome        to           Hefshine       ";
		int i = 0, j = s.length() - 1;
		while (true) {
			if (s.charAt(i) == ' ')
				i++;
			else
				break;

		}
		while (true) {
			if (s.charAt(j) == ' ')
				j--;
			else
				break;

		}
		String s1 = "";
		for (int k = i; k <= j; k++) {
			s1 = s1 + s.charAt(k);
		}
		String s2 = "";
		for (int k = 0; k < s1.length(); k++) {
			if (s1.charAt(k) == ' ' && s1.charAt(k + 1) == ' ') {

			} else {
				
				s2=s2+s1.charAt(k);
			}
		}
		System.out.println(s2);
	}

}
