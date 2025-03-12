package string;

public class Example_find_duplicate_and_sort_count_bases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdabcdabcd";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				if (s.charAt(i) == s.charAt(j)) {

					cnt++;
				}
			}
			if (cnt == 0) {
				s1 = s1 + s.charAt(i);
			}

		}
		char[] ca = s1.toCharArray();
		int[] ia = new int[ca.length];
		for (int i = 0; i < ca.length; i++) {
			char ch = ca[i];
			int cnt = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == ch) {
					cnt++;
				}

			}
			ia[i] = cnt;

		}
		for (int i = 0; i < ia.length; i++) {
			for (int j = 0; j < ia.length; j++) {
				if (ia[i] > ia[j])
				// if(ca[i]<ca[j])
				{

					int temp1 = ia[i];
					ia[i] = ia[j];
					ia[j] = temp1;

					char temp2 = ca[i];
					ca[i] = ca[j];
					ca[j] = temp2;
				}
			}
		}
		for (int i = 0; i < ia.length; i++) {
			System.out.print(ia[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < ca.length; i++) {
			System.out.print(ca[i] + " ");
		}
	}

}
