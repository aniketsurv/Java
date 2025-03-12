package test;

public class Programendswith2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdefg";
		String s2 = "efig";
		boolean result = myend(s1, s2);
		System.out.println(result);
	}

	private static boolean myend(String s1, String s2) {
		// TODO Auto-generated method stub
		if (s1.length() >= s2.length()) {

			int i = s1.length() - 1;
			int j = s2.length() - 1;
			int count = 0;
			for (int j2 = 0; j2 < s2.length(); j2++) {
				if (s1.charAt(i) == s2.charAt(j)) {

					count++;
				}
				i--;
				j--;
			}
			if (count == s2.length())
				return true;
		}
		return false;
	}

}
