package string;

public class Method_index_of_impliment_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcde";
		String s2 = "c";
		int index = myindex(s1, s2);
		System.out.println(index);

	}

	private static int myindex(String s1, String s2) {

		if (s1.length() >= s2.length()) {

			for (int i = 0; i < s1.length(); i++) {
				int x = i;
				int cn = 0;
				for (int j = 0; j < s2.length() && x < s1.length(); j++) {
					if (s1.charAt(x) == s2.charAt(j)) {
						cn++;
					} else {
						break;
					}
					x++;
				}
				if (cn == s2.length()) {
					return i;
				}
			}

		} else {
		return	-1;
		}

		return -1;
		// TODO Auto-generated method stub

	}

}
