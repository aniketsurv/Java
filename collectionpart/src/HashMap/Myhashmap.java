package HashMap;

public class Myhashmap<d1, d2> {
	@SuppressWarnings("rawtypes")
	NodeA[] roots = new NodeA[16];

	public void print() {

		for (int i = 0; i < roots.length; i++) {
			NodeA<d1, d2> root = roots[i];

			while (root != null) {
				System.out.println(root.key + " " + root.value);
				root = root.next;

			}
		}
	}

	public void add(d1 key, d2 value) {

		int index = key.hashCode() % roots.length;
		if (index < 0)
			index = index * -1;

		NodeA<d1, d2> newobj = new NodeA<>(key, value);
		if (roots[index] == null) {
			roots[index] = newobj;
		} else {
			NodeA<d1, d2> temp = roots[index];
			
			while (temp.next != null) {
				if (temp.key.equals(key)) {
					temp.value = value;
					return;
				}
				temp = temp.next;
			}
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}

			temp.next = newobj;

		}

	}

	public d2 get(d1 key) {

		int index = key.hashCode() % roots.length;
		if (index < 0)
			index = index * -1;
		NodeA<d1, d2> root = roots[index];
		while (root != null) {
			if (root.key == key)
				return root.value;
			root = root.next;
		}
		return null;
	}

}
