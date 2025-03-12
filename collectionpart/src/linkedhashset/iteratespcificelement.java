package linkedhashset;

import java.util.Iterator;
import java.util.LinkedList;

public class iteratespcificelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(80);

		Iterator p=list.listIterator(1);
		while(p.hasNext()) {
			System.out.println(p.next());
		}

	}

}
