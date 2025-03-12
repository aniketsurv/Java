package Stackconcept;

public class Mystack1 {
	int a[] = new int[5];
	int index = 0;
	

	public void push(int num) {
		// TODO Auto-generated method stub
		if (index < 5)
			a[index++] = num;
		else {

		}
	}

	public int pop() {
		// TODO Auto-generated method stub
		if (index > 0) {
			index--;
			return (a[index]);
		} else {
			System.out.println("index less than zero");
			return 0;
		}
	}
}
