package june10sir;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		int divisiblecount = 0;

		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0)
				divisiblecount++;
		}
		if (divisiblecount == 0)
			System.out.println("prime");
		else {
			System.out.println("not prime");
		}
	}

}
