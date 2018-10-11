import java.util.Scanner;

public class Factor {

	public static void factorization(int n) {
		int ar[] = {2,3,5,7,11,13,17,19,23,29};
		while(n%2==0) {
			System.out.println(2 +"");
			n/=2;
		}
		
			for (int i = 0; i < ar.length&&ar[i]<=n; i++) {
				while(n%ar[i]==0) {
					System.out.println(ar[i]);
					n/=ar[i];
			}
		}
			  if (n > 2) 
		            System.out.print(n); 
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = s.nextInt();
		factorization(i);
		s.close();
	}
}
