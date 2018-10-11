import java.util.Scanner;

public class stopWatch {
	public static void calWatch() {
		long start = 0;
		long stop = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 0 to start timer");
		int i = s.nextInt();
		if(i == 0) {
			start = System.currentTimeMillis();
		}
		System.out.println("Enter 1 to stop timer");
		int j = s.nextInt();
		if(j==1) {
			stop = System.currentTimeMillis();
		}
		System.out.println((stop-start)/1000+" seconds");
	s.close();
	}	
public static void main(String args[]) {
	calWatch();
}
}
