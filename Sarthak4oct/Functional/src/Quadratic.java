import java.util.Scanner;

public class Quadratic {
public static void cal() {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a");
	int a = s.nextInt();
	System.out.println("Enter b");
	int b = s.nextInt();

	System.out.println("Enter c");
	int c = s.nextInt();
	double delta = Math.abs(b*b - 4*a*c);
	double r1x = (-b + Math.pow(delta,0.5))/(2*a);
	double r2x = (-b - Math.pow(delta, 0.5))/(2*a);
	System.out.println(r1x);
	System.out.println(r2x);
	s.close();


}
public static void main(String[] args) {
	cal();
}
}
