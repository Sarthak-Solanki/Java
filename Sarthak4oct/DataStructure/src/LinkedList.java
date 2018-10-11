public class LinkedList<G>{
	Node head;
	int size;
	public  void add(G data) {
		Node node = new Node();
		node.data = (String) data;
		node.next = null;
		if(head==null) {
			head= node;
		}

		else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	public void display() {
		Node n = head;
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	public void remove(G data) {
		Node n = head;
		if(n.data.equals(data)) {
			head = head.next;
			size--;
		}
		else {
			Node temp = head;
			Node between  = temp.next;
			Node after = between.next;
			while(between.next!=null) {
				if(between.data.equals(data)) {
					temp.next=after;
					size--;
				}
				temp = temp.next;
				between = between.next;
				after = after.next;
			}
		}
	}
	public void size() {
		System.out.println(size);
	}
	public boolean search(G data) {
		boolean b= false;
		Node n = head;
		while(n.next!=null) {
			if(n.data.equals(data)) {
				System.out.println("\n"+data+" Found");
				b= true;
			}
			n = n.next;
		}
		return b;
	}
	
	public String getData(){
		Node n = head;
		String st = "";
		while(n!=null) {
			st = st+n.data+" ";
			n = n.next;
		}
		System.out.println(st);
		return st;
	}
}