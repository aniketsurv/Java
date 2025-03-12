package string;

public class Example_logest_subString_sir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "traning";

		String max = "";
		for (int i = 0; i < s.length(); i++) {
			String s1 = "";
			for (int j = i; j < s.length(); j++) {
				char ch = s.charAt(j);
				boolean result = ischPresnt(s1, ch);
				if (result == false) {
					s1 = s1 + ch;

					if (s1.length() > max.length())
						max = s1;

				} else
					break;

			}
		}

		System.out.print(max);

	}

	private static boolean ischPresnt(String s1, char ch) {
		// TODO Auto-generated method stub
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ch)
				return true;
		}
		return false;
	}

}
