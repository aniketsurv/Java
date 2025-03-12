package string;

public class Example_logest_sub_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "traning";
		int max = 0;
		int sindex = 0;
		int eindex = 0;
		for (int i = 0; i < s.length(); i++)
		{
			for (int j = i + 1; j < s.length(); j++) 
			{
				boolean flag = false;
				for (int k = i; k < j; k++)
				{
					if (s.charAt(k) == s.charAt(j))
					{
						flag = true;
						break;
					}
				}
				if (flag) {
					if ((j - i) > max) {
						max = j - i;
						sindex = i;
						eindex = j - 1;

					}
					break;
				} 
				else if (j == s.length() - 1) {
					if ((j - i - 1) > max) {
						max = j - i + 1;
						sindex = i;
						eindex = j;

					}
				}
			}
		}
		System.out.println(max);
		for (int i = sindex; i <= eindex; i++) {
			System.out.print(s.charAt(i));
		}

	}

}
