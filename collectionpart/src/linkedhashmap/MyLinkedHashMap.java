package linkedhashmap;

public class MyLinkedHashMap<d1, d2> {

	// TODO Auto-generated method stub

	Node<d1, d2>[] a = new Node[5];
	Node<d1, d2> root;

	public void print() {
		Node<d1, d2> temp = root;
		while (temp != null) {
			System.out.println(temp.key + " " + temp.value+"  ");
			temp = temp.rednext;

		}
	}

	public d2 get(d1 key) {

		int index = key.hashCode() % a.length;
		Node<d1, d2> hashmapcthayalinkedlistcharoo = a[index];
		while (hashmapcthayalinkedlistcharoo.bluenext != null) {
			if (hashmapcthayalinkedlistcharoo.key.equals(key)) {
				return hashmapcthayalinkedlistcharoo.value;
			}
			hashmapcthayalinkedlistcharoo = hashmapcthayalinkedlistcharoo.bluenext;
		}

		return null;
	}

	public void add(d1 key, d2 value) {

		Node<d1, d2> obj = new Node<d1, d2>(key, value);

		int index = key.hashCode() % a.length;
		Node<d1, d2> hashmapcthayalinkedlistcharoo = a[index];
		if (hashmapcthayalinkedlistcharoo == null)
			a[index] = obj;
		else {
			while (hashmapcthayalinkedlistcharoo.bluenext != null)
				hashmapcthayalinkedlistcharoo = hashmapcthayalinkedlistcharoo.bluenext;
			hashmapcthayalinkedlistcharoo.bluenext = obj;

		}
		if (root == null)
			root = obj;
		else {
			Node<d1, d2> temp = root;
			while (temp.rednext != null) {
				temp = temp.rednext;
			}
			temp.rednext = obj;
		}

	}

}
