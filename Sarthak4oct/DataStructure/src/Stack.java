
public class  Stack<G> {
	static Node head;
	static int size;

	public  void push(G data) {
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

	public void display() {
		Node n = head;
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	public void pop() {

		if(isEmpty()) {
			System.out.println("Stack is Empty cant pop the data");
			return;
		}
		else {
			Node n = head;
			Node prev = null ;
			while(n.next!=null) {
				prev = n ;
				n = n.next;
			}
			if(prev==null)
			{
				head=null;
				size--;
				return ;
			}
			
			prev.next = null ;
			size--;
			return;
		}
	}
	public boolean isEmpty() {

		return size==0;
	}

	public G peek() {
		Node n = head;
		while(n.next!=null) {
			n = n.next;
		}
		return (G)n.data;
	}

}

