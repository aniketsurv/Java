package test;

public class Secondmostchar6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcda";

		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			int count = 0;
			for (int j = 0; j < i; j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					count++;
					break;

				}
			}
			if(count==0)
				s2=s2+s1.charAt(i);

		}
		char ca[] = s2.toCharArray();
		int ira[] = new int[ca.length];
		for (int i = 0; i < ca.length; i++) {
			int cn = 0;
			for (int j = 0; j < s1.length(); j++) {
				if (ca[i] == s1.charAt(j)) {
					cn++;
				}
			}
			ira[i] = cn;

		}
		for (int i = 0; i < ira.length; i++) {
			for (int j = 0; j < ira.length; j++) {
				if (ira[i]>ira[j]) {
					int temp=ira[i];
					ira[i]=ira[j];
					ira[j]=temp;
					char temp2=ca[i];
					ca[i]=ca[j];
					ca[j]=temp2;
					
				}
			}
		}
		System.out.println(ca[0]+" "+ira[0]);
	}

}
