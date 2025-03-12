package collection_problem;

import java.util.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class Myclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Student2>list=new ArrayList<>();
list.add(new Student2(1,"Somu",70));
list.add(new Student2(2,"Gomu",40));
list.add(new Student2(3,"Somya",60));
list.add(new Student2(4,"Gomya",80));
list.add(new Student2(5,"ATomu",50));
list.add(new Student2(6,"Tomya",55));
Collections.sort(list,new Staff());
for(Student2 i:list)
	System.out.println(i);
	}
	

}
