import java.util.Scanner;

public class ReplaceString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String st = "hello <<username>>,how are you?";
		System.out.println("Enter your name");
		String st2 = s.nextLine();
		System.out.println(st.replaceFirst("<<username>>", st2));
		s.close();
	}
}
