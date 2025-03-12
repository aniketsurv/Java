package getset;

class Test {
	private String username, password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

public class Getsetmethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.setUsername("ajit");
		t.setPassword("******");
		System.out.println("user name :"+t.getUsername()+"\npassword : " + t.getPassword());
	}

}
