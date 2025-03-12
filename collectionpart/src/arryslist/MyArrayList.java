package arryslist;

public class MyArrayList {
	private int[] a = new int[5];
	private int index = 0;

	public int get(int i) {
		if (i < 0 || i >= index) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return a[i];
	}

	public void add(int i, int num) {

		if (i < 0 || i > index)
			throw new ArrayIndexOutOfBoundsException();
		if (index >= a.length) {
			grow();
		}
		for (int j = index; j > i; j--) {
			a[j] = a[j - 1];
		}
		a[i] = num;
		index++;

	}

	public void add(int num) {
		// TODO Auto-generated method stub
		if (index >= a.length) {
			grow();
		}
		a[index] = num;
		index++;
	}

	private void grow() {
		// TODO Auto-generated method stub
		int[] b = new int[2 * a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		a = b;
	}

	public String toString() {
		String s = "[";
		for (int i = 0; i < index; i++) {
			if (i < index - 1) {
				s = s + a[i] + ", ";
			} else
				s = s + a[i];
		}
		s = s + "]";
		return s;
	}

	public void set(int i, int num) {
		if (i >= 0 && i < index) {
			a[i] = num;
		} else
			throw new ArrayIndexOutOfBoundsException();
	}

	public void remove(int i) {
		// TODO Auto-generated method stub
		if (i < 0 || i > index)
			throw new ArrayIndexOutOfBoundsException();

		for (int j = i; j < index; j++) {
			a[j] = a[j + 1];

		}
		index--;
	}

	public void removeElement(int num) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				for (int j = i; j < index; j++) {
					a[j] = a[j + 1];

				}
				break;

			}
		}
		index--;

	}

	public void clear() {

		index = 0;

	}

	public Object Myclone() {
		// TODO Auto-generated method stub
		MyArrayList list1 = new MyArrayList();
		for (int i = 0; i < index; i++) {
			list1.add(a[i]);
		}
		return list1;
	}

	public boolean contains(int data) {
		// TODO Auto-generated method stub
		for (int j = 0; j < index; j++) {
			if (a[j] == data)
				return true;
		}
		return false;
	}

	public boolean isEmpty() {

		if (index == 0)
			return true;
		return false;
	}

	public int indexOf(int data) {
		// TODO Auto-generated method stub
		for (int i = 0; i < index; i++) {
			if (a[i] == data)
				return i;
		}
		return -1;
	}

	public int lastIndexOf(int data) {
		// TODO Auto-generated method stub
		for (int j = index-1; j >= 0; j--) {
			if (data == a[j])
				return j;
		}
		return -1;
	}
	

}
