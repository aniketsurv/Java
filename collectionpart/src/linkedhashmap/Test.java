package linkedhashmap;

public class Test {
public static void main(String[] args) {
	MyLinkedHashMap<Integer, String>map=new MyLinkedHashMap<>();

	map.add(8,"a");
	map.add(87,"b");
	map.add(23,"c");
	map.add(53,"d");
	map.add(99,"e");
	map.add(69,"f");
	map.add(87,"g");
	map.add(25,"h");
	map.add(39,"i");
	System.out.println("Serching value: "+map.get(8));
	map.print();

}



}
