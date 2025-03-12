package jdbc_connection_project;

public class Student {
	 int id;
	 String name;
	 int marks;

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	
	}
}
