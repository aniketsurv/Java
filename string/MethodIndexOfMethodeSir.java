package string;

public class MethodIndexOfMethodeSir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "prayaabcd";
		String s2 = "abcd";
		if (s2.length() <= s1.length()) {

			for (int i = 0; i < s1.length(); i++) {

				if (s1.charAt(i) == s2.charAt(0)) {
					int cnt = 0;
					int x = i;
					for (int j = 0; j < s2.length()&&x<s1.length(); j++) {
						if (s1.charAt(x) == s2.charAt(j)) {
							cnt++;
							x++;
						} else
							break;
					}
					if (cnt == s2.length()) {
						System.out.println(i);

					}
				}
			}
		} else
			System.out.println(-1);
	}

}
