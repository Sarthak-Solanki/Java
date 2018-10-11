import java.io.PrintWriter;
import java.util.Scanner;

public class D2Array {
	public static Integer[][] intAr() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter coulumn");
		int col  = s.nextInt();
		System.out.println("Enter row");
		int row  = s.nextInt();
		Integer ar[][] = new Integer[row][col];
		if(row!=col) {
			System.out.println("row and coulumn should be same");
		}
		System.out.println("Enter integer value");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
              ar[i][j] = s.nextInt();
			}
		}
		return ar;
	}
	public static Boolean[][] booleanAr() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter coulumn");
		int col  = s.nextInt();
		System.out.println("Enter row");
		int row  = s.nextInt();
		Boolean ar[][] = new Boolean[row][col];
		if(row!=col) {
			System.out.println("row and coulumn should be same");
		}
		System.out.println("Enter boolean value ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
              ar[i][j] = s.nextBoolean();
			}
		}
		return ar;
	}
	public static Double[][] doubleAr() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter coulumn");
		int col  = s.nextInt();
		System.out.println("Enter row");
		int row  = s.nextInt();
		Double ar[][] = new Double[row][col];
		if(row!=col) {
			System.out.println("row and coulumn should be same");
		}
		System.out.println("Enter double value ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
              ar[i][j] = s.nextDouble();
			}
		}
		return ar;
	}
        static <T> void display(T[][] ar) {
		PrintWriter pr = new PrintWriter(System.out);
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				pr.print(ar[i][j]+"   ");
				pr.flush();
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Integer[][] ar = intAr();
		Boolean[][] b = booleanAr();
		Double[][] d = doubleAr();
		
		display(ar);
		display(b);
		display(d);
	}
}
