package string;

public class Example_palidrome_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stuString
		String s = "nitin";
		String s2 = "";
		boolean ispalidrome = true;
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				ispalidrome = false;
				break;
			}
			i++;
			j--;
		}
		if (ispalidrome) {
			System.out.println("palidrome");
		} else {
			System.out.println("not palidrome");
		}
	}

}
