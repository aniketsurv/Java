package finalkey;

class Student1 {
	int id;
	String name;
	Address address;

	public Student1(int id, String name, Address address) {

		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		// TODO Auto-generated method stub
		System.out.println("name : " + name);
		System.out.println("id : " + id);
		System.out.println("flat no : " + address.flatno);
		System.out.println("city : " + address.city);
		System.out.println("state : " + address.state);
	}

}

class Address {
	int flatno;
	String city, state;

	public Address(int flatno, String city, String state) {

		this.flatno = flatno;
		this.city = city;
		this.state = state;
	}

}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s = new Student1(101, "ajit", new Address(1, "pune", "mh"));
		s.display();

	}

}
