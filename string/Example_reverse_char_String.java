package string;

public class Example_reverse_char_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "You all are very very good student";
		String[] sa = s.split(" ");

		for (int i = 0; i < sa.length; i++) {
			char[] ca = sa[i].toCharArray();
			int start = 0;
			int end = ca.length - 1;
			while (start < end) {
				char temp = ca[start];
				ca[start] = ca[end];
				ca[end] = temp;
				start++;
				end--;

			}
			sa[i]=new String(ca);
			
		}
		for (int i = 0; i < sa.length; i++) {
			System.out.print(sa[i]+" ");
		}
	}

}
