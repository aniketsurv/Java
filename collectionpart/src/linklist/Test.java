package linklist;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyLinkedList<Integer> list=new MyLinkedList<>();
list.add(0);
list.add(5);
list.add(10);
list.add(20);
list.add(30);
list.add(80);
list.add(90);
list.add(320);

//list.print();
System.out.println(list.LastIndexof(320));
	}

}
