package arryslist;

import java.util.ArrayList;
import java.util.Collections;

public class addnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(10);
		list.add(80);

		System.out.println(list);
		list.clear();
		list.add(50);

		System.out.println(list);

		System.out.println();
	}

}
