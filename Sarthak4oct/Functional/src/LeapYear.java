import java.util.Scanner;

public class LeapYear {
	public static void LeapCount(int year) {
		if(year%100 != 0&&year%4==0||year%400==0) {
			System.out.println("Leap Year");
		}
		else
			System.out.println("Not a leap year");
	}
	public static void main(String[] args) {
		Scanner s  =new Scanner(System.in);
		System.out.println("Enter a year you want to check");
		int year = s.nextInt();
		LeapCount(year);
		s.close();
	}
}
