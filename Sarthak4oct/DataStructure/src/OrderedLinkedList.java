import java.util.Arrays;

public class OrderedLinkedList<G> implements Comparable<G>  {
	static Node head;
	static int size;
	
	public  void add(G data) {
		Node node = new Node();
		node.data = (String) data;
		node.next = null;
		if(head==null) {
			head= node;
			size++;
		}

		else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
				size++;
			}
			n.next = node;
		}

	}

	public  void reArrange() {
		Node node = head;
		OrderedLinkedList<G> ol = new OrderedLinkedList<G>();
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				if(ol.compareTo((G) node.data)>0) {
					String s = (String) node.data;
					node.data = node.next.data;
					node.next.data = s;
				}
			}
		}
	}
	public void display() {
		Node n = head;
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	@Override
	public int compareTo(G o) {
		return(compareTo(o));
	}
}
