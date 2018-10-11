import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Coupan {
	public static void generateCoupan(int n) {
		Random rn = new Random(n);
		int count=0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < n;) {
			count++;
			int z = rn.nextInt(n);
			if(!al.contains(z)) {
				System.out.println(z);
				i++;
			}
			al.add(z);
			
		}
		System.out.println("no of times took to generate is "+count);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of coupan you want");
		int n  =s.nextInt();
		generateCoupan(n);
		s.close();
	}
}
