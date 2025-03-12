package string;

public class Methode_internal_endswith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "programing";
		String s2 = "ming";
		System.out.println(s1.endsWith(s2));
		if (s2.length() <= s1.length()) {
			int s1index = s1.length() - 1;
			int s2index = s2.length() - 1;
			int i = 0;
			int cnt = 0;
			while (i < s2.length()) {
				if (s2.charAt(s2index) == s1.charAt(s1index)) {
					cnt++;
				}
				s2index--;
				s1index--;
				i++;
			}
			if (cnt == s2.length()) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}

		}

	}

}
