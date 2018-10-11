package java.util;

public class LinkedLists {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(7);
		ll.add(74);
		ll.add(24);
		ll.add(44);
		for (Integer integer : ll) {
			System.out.println(integer);
		}
	}
}
