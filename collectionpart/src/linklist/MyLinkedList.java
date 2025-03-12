package linklist;

public class MyLinkedList<d> {
	Node<d> root = null;

	public void print() {
		Node<d> printtemp = root;
		while (printtemp != null) {
			System.out.println(printtemp.data);
			printtemp = printtemp.next;
		}

	}

	public void add(d num) {
		Node<d> newobj = new Node<d>(num);
		if (root == null)
			root = newobj;
		else {
			Node<d> temp = root;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = newobj;
		}

	}

	void add(int index, d data) {
		if (index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		Node<d> newobj = new Node<d>(data);
		int count = 0;
		if (count == index) {
			newobj.next = root;
			root = newobj;
			return;

		}
		Node<d> temp = root;
		while (temp.next != null) {
			if (count == index - 1) {
				newobj.next = temp.next;
				temp.next = newobj;
				return;
			}
			count++;
			temp = temp.next;
		}
		if (count == index - 1)
			temp.next = newobj;

		throw new ArrayIndexOutOfBoundsException();

	}

	public boolean contains(d data) {
		Node<d> temp = root;
		while (temp != null) {
			if (temp.data == data)
				return true;
			temp = temp.next;
		}
		return false;
	}

	public int LastIndexof(d data) {
		int count = 0;
		int index = 0;
		Node<d> temp = root;
		while (temp != null) {
			if (temp.data.equals(data)) {
				index = count;
			}
			temp = temp.next;
			count++;

			
		}
		return index;
	}

}
