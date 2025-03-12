package string;

public class LastIndex_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Welcome";
int lastindex=s1.lastIndexOf("e");
System.out.println(lastindex);
int index=s1.lastIndexOf("e", 5);
System.out.println(index);
System.out.println(s1.lastIndexOf(s1, 4));
	}

}
