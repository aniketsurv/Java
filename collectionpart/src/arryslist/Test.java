package arryslist;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList list = new MyArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(20);
		System.out.println(list);
System.out.println(list.lastIndexOf(20));

		System.out.println(list.Myclone());
	}

}
