import java.util.Scanner;

public class Table {
	public static void PowerOf2(int num) {
		if(num>0&&num<31) {
			for (int i = 0; i < num; i++) {
				System.out.println((int)Math.pow(2, i));
			}
		
		}
		else
			System.out.println("Enter a num between 0 to 31");
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		PowerOf2(num);
		s.close();
	}
}
