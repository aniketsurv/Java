package linklist;

public class Node<d> {
	d data;
	Node<d> next;

	Node(d data) {
		this.data=data;
		this.next=null;
	}
}
