
public class Queue<G> {
	Node head;
	int size;
	public  void enque(G data) {
		Node node = new Node();
		node.data = (G) data;
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
	public void deque() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else {
			Node n = head;
			if(head!=null) {
				head= head.next;
				size--;
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
	public boolean isEmpty() {
		return size==0;
	}
	public int size() {
		return size;
	}
	public static void main(String[] args) {
		Queue<Integer> qu = new Queue<Integer>();
		qu.enque(44);
		qu.enque(55);
		qu.enque(66);
		qu.enque(77);
		System.out.println(qu.size());
		qu.display();
		qu.deque();
		qu.deque();
		qu.deque();
		qu.deque();
		qu.deque();
		qu.display();
		System.out.println(qu.size());
	}
}
