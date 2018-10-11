import java.util.Scanner;

public class HarmonicNum {
	public static void print(int n) {
		if(n>0) {
			double d = 0;
			for (double i = 1; i <= n; i++) {
				d = d+(1/i);
				System.out.println(d);
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		s.close();
		print(n);
	}
}
