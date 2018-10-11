import java.util.Scanner;

public class Distance {
	public static void calEuclidean() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter x");
		double x = s.nextInt();
		System.out.println("Enter y");
		double y = s.nextInt();
		//double Euclidean = Math.sqrt(Math.pow(x, 2)*Math.pow(y,2));
		System.out.println(Math.sqrt(Math.pow(x, 2)*Math.pow(y,2)));
		s.close();
	}
	public static void main(String[] args) {
		calEuclidean();
	}
}
