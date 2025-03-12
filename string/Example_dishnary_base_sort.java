package string;

public class Example_dishnary_base_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s1 = { "kiran"," ajit", "ajay" ,"ram","somya","gomya" };

		for (int i = 0; i < s1.length; i++) {
			for (int j = i + 1; j < s1.length; j++) {
				if (s1[i].compareToIgnoreCase(s1[j]) > 0) {
					String temp = s1[i];
					s1[i] = s1[j];
					s1[j] = temp;
				}
			}
		}
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
	}

}
