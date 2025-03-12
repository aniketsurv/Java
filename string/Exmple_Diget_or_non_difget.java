package string;

public class Exmple_Diget_or_non_difget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using boolean types
		/*String s = "ajit5";
		boolean count = true;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch < '0' || ch > '9') {
				count = false;
				break;
			}
		}
		if (count) {
			System.out.println("only digit");
		} else {
			System.out.println("not digit");
		}*/
		//using int type
		String s = "556465";
		int  count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch < '0' || ch > '9') {
				count ++;
				break;
			}
		}
		if (count==0) {
			System.out.println("only digit");
		} else {
			System.out.println("not digit");
		}

	}

}
