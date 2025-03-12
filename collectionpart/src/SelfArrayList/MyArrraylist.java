package SelfArrayList;

public class MyArrraylist {
	Node12[] roots = new Node12[5];

	public void add(int num) {

		int index = num % roots.length;
		Node12 root = roots[index];
		Node12 newobj = new Node12(num);
		if (root == null) {
			roots[index] = newobj;
		} else {
			Node12 temp = root;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newobj;

		}

	}

	public boolean contains(int num) {
		int index = num % roots.length;
		Node12 root = roots[index];
		while (root != null) {
			System.out.println(root.data);
			if (root.data == num)
				return true;

			root = root.next;
		}

		return false;
	}
}
