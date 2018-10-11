import java.util.Scanner;

public class SumIsZero {
public static void sumZero() {
	Scanner s = new Scanner(System.in);
	System.out.println("how many num");
	int n = s.nextInt();
	int ar[] = new int[n];
	for (int i = 0; i < n; i++) {
		ar[i] = s.nextInt();
	}
	for (int j = 0; j < ar.length; j++) {
		for (int i = j+1; i < ar.length; i++) {
			for (int k = i+1; k < ar.length; k++) {
				if(ar[j]+ar[i]+ar[k]==0) {
					System.out.print("Sum of "+ar[j]+" "+ar[i]+" "+ar[k]+" is zero");
				}
			}
		}
	}
}
public static void main(String[] args) {
	sumZero();
}
}
