import java.util.Scanner;

public class NewtonSqrt {
public static void sqrt() {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number");
	double c = s.nextDouble();
	double t = c;
	double epsilon = 1e-15;
	while(Math.abs(t - c/t) > epsilon*t) {
		t = (((c/t)+t)/2.0);
	}
	System.out.println(t);
}
public static void main(String[] args) {
	sqrt();
}
}
