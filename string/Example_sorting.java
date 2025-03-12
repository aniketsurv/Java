package string;

public class Example_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "45678123";
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] < ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		String s2 = new String(ch);
		System.out.println(s2);
	}

}
