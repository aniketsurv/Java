package Hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class Addnumber {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	HashSet<Integer> list=new HashSet<>();

	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	list.add(60);
	list.add(70);
	list.add(80);
	System.out.println(list);
	Integer num=40;
	list.remove(num);
	System.out.println(list);
		}

	}


