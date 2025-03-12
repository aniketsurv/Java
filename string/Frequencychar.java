package string;

public class Frequencychar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdaabcdabcdabcdabcd";
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					count++;
					break;
					
				}
			}

		}

		Pair[] a = new Pair[s1.length()-count];
		System.out.println(a.length);
		for (int i = 0; i < s1.length(); i++) {
			int cn = 0;
			for (int j = 0; j < i; j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					cn++;
					break;

				}
			}
			if (cn == 0) {

				int cnt = 0;
				for (int j = 0; j < s1.length(); j++) {
					if (s1.charAt(i) == s1.charAt(j)) {
						cnt++;
					}
				}
				Pair data = new Pair(s1.charAt(i), cnt);
				a[i] = data;

			}
		}
		for (int i = 0; i < a.length; i++) {
			Pair data = a[i];
			System.out.println(data.ch + " " + data.count);
		}
	}

}
