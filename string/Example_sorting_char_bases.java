package string;

public class Example_sorting_char_bases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "welcome to the world of java";
		String[] sa = s1.split(" ");
		String s2 = "";
		for (int i = 0; i < sa.length; i++) {
			for (int j = i + 1; j < sa.length; j++) {
				if (sa[i].length() < sa[j].length()) {
					String temp = sa[i];
					sa[i] = sa[j];
					sa[j] = temp;
				}
			}
		}

		for (int i = 0; i < sa.length; i++) {
			System.out.println(sa[i]);
		}
		System.out.println("largest number:" + sa[0]);
		System.out.println("smllest number:" + sa[sa.length - 1]);
		
	}

}
