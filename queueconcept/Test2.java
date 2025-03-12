package queueconcept;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue m = new MyQueue();
		System.out.println(m.pop());
		m.push(10);
		m.push(20);
		m.push(30);
		m.push(40);
		m.push(50);
		
		
	
		System.out.println(m.pop());
		System.out.println(m.pop());
		System.out.println(m.pop());
		System.out.println(m.pop());
		System.out.println(m.pop());
		
		
		

	}

}
