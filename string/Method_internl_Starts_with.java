package string;

public class Method_internl_Starts_with {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcde";
		String s2 = "abd";
		System.out.println(s1.startsWith(s2));
		if (s2.length() <= s1.length()) {
			int i = 0;
			int cnt = 0;
			while (i < s2.length()) {
				if (s1.charAt(i) == s2.charAt(i)) {
					cnt++;
				}
				i++;
			}
			if (cnt == s2.length()) {
			System.out.println(true);
			}else {
				System.out.println(false);
			}

		}

	}

}
