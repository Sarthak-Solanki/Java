
public class StackRunner {
	public static void main(String[] args) {
		Stack<Integer> st= new Stack<Integer>();
		st.push(24);
		st.push(2);
		st.push(4);
		st.push(14);
		st.display();
		st.peek();
		st.pop();
		st.pop();
		System.out.println(st.isEmpty());
		st.pop();
		st.pop();
		st.pop();
		st.display();

		//st.display();

	}
}
