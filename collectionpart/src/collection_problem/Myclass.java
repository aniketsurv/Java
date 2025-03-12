package collection_problem;

import java.util.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Student>list=new ArrayList<>();
list.add(new Student(1,"Somu",70));
list.add(new Student(2,"Gomu",40));
list.add(new Student(3,"Somya",60));
list.add(new Student(4,"Gomya",80));
list.add(new Student(5,"ATomu",50));
list.add(new Student(6,"Tomya",55));
Collections.sort(list);
for(Student i:list)
	System.out.println(i);
	}
	

}
