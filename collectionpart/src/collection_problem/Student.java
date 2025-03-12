package collection_problem;

public class Student implements Comparable<Student> {
	int id;
	String naav;
	int marks;

	public Student(int id, String naav, int marks) {
		super();
		this.id = id;
		this.naav = naav;
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (marks > o.marks)
			return -1;
		else if (marks < o.marks)
			return 1;
		else
			return 0;
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", naav=" + naav + ", marks=" + marks + "]";
	}
	
}
