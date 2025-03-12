package linkedhashset;

import java.util.*;

public class Compredtwolist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list = new LinkedList<>();
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<String> list2 = new LinkedList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(80);
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		System.out.println(list);
		for (Integer integer : list) {

			if (list1.contains(integer)) {
				list2.add("true");
			}
			else
				list2.add("false");
		}
		System.out.println(list2);
		
	}

}
