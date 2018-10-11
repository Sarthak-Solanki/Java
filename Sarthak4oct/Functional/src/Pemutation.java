
public class Pemutation {
	static void permutation(String st) {
		//abcd
		String st2 = st;
		char ch[] = st.toCharArray();
		char temp;
		st = "";
		char last = ch[ch.length-1];
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				temp = ch[i];
				ch[i] = ch[j];
				st = st+ch[i];
				ch[j] =temp;
				st = st+ch[j];
				if(!st.equals(st2)) {
				System.out.println(ch);
				}
			}
		}
	}
	public static void main(String[] args) {
		String st = "abc";
		permutation(st);
	}
}
