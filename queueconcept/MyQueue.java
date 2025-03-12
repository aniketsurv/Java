package queueconcept;

public class MyQueue {
	int i1 = 0, i2 = 0, count = 0;
	int a[] = new int[5];

//	public void push(int add) {
//		// TODO Auto-generated method stub
//		if (count >= a.length) {
//			System.out.println("queue is full");
//		} else {
//			a[i1++] = add;
//			if(i1==a.length)
//				i1=0;
//			count++;
//		}
//	}
//
//	public int pop() {
//		// TODO Auto-generated method stub
//		if (count <= 0) {
//			System.out.println(" oueue is empty");
//			return 0;
//		} else {
//			int i2d=i2;
//			i2++;
//			if(i2==a.length)
//				i2=0;
//			count--;
//			return a[i2d];
//
//		}
//	}
	public void push(int add) {
		// TODO Auto-generated method stub
		if (i1 >= a.length) {
			System.out.println("queue is full");
		} else {
			a[i1++] = add;
			if(i1==a.length)
				i1=0;
			
		}
	}

	public int pop() {
		// TODO Auto-generated method stub
		if (i2 <= -1) {
			System.out.println(" oueue is empty");
			return 0;
		} else {
			int i2d=i2;
			i2++;
			if(i2==a.length)
				i2=0;
			return a[i2d];

		}
	}
}
