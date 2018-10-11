import java.util.Scanner;

public class WindChill {
	public static void chill() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter temp less than 50");
		double temp = s.nextInt();
		System.out.println("Enter wind speed between 3 to 120");
		double speed = s.nextInt();
		if (temp > 50 || speed < 3 || speed > 120) {
			System.out.println("invalid input");
		}
		double w = 35.74+ (0.6215 * temp) + (0.4275 * temp - 35.75) * Math.pow(speed, 0.16);
		System.out.println(w);
		s.close();
	}

	public static void main(String[] args) {
		chill();
	}
}
