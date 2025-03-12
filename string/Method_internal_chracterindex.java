package string;

public class Method_internal_chracterindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abaahavkbvuj";
		char ch1 = 'j';
		int cnt=0;
		char ch[] = s1.toCharArray();
		for (int i = 0; i < s1.length(); i++) {
			if (ch[i] == ch1) {
			System.out.println(i);
			cnt++;
			break;
			}
		}
		if(cnt==0) {
			System.out.println(-1);
		}
	}

}
