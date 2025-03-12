package collection_problem;

public class Student2 {
	int id;
	String naav;
	int marks;

	public Student2(int id, String naav, int marks) {
		super();
		this.id = id;
		this.naav = naav;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", naav=" + naav + ", marks=" + marks + "]";
	}
}
