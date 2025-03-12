package string;

public class Example_removing_spcific_chararray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcjjbbbbdefa";
		char ele = 'b';
		String s2 = "";
		int count = 0;
		char[] ca = s1.toCharArray();
		for (int i = 0; i < ca.length; i++) {
			if (ca[i] != ele) {
				
				
					s2 = s2 + ca[i];
			}
			
		}
		System.out.println(s2);

	}

}
