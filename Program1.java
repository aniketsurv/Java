package test;

import java.util.Iterator;

public class Program1 {

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
			System.out.println(ca[i]+" "+ira[i]);
		}
	}

}
