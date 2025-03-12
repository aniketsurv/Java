package collection_problem;

import java.util.Comparator;

public class Staff implements Comparator<Student2> {

	@Override
	public int compare(Student2 o1, Student2 o2) {
		// TODO Auto-generated method stub
		if (o1.marks > o2.marks)
			return -1;
		else if (o1.marks < o2.marks)
			return 1;
		else
			return 0;
	}

}
