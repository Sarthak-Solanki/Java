import java.util.Scanner;

import javax.print.attribute.standard.RequestingUserName;

public class VendingMachine {
	public static void returnNote(int n) {
		int[] ar = { 1, 2, 5, 10, 50, 100, 500, 1000 };

		if (n == 0) {
			return;
		} else {
			int j = 0;
			for (int i = 0; i < ar.length; i++) {
				if(ar[i]>n||n>1000) {
					if(n>1000) {
						j = 1000;		
					}
					else {
						j = ar[i-1];
						}
					int qui = n / j;
					n = n % j;
					System.out.println(j + " note " + qui + "times");
					returnNote(n);
					break;

				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter amount");
		int n = s.nextInt();
		returnNote(n);
	}
}
/*
 * while(n>=ar[count]) { count++; } if(n<=ar[count]) { if(count<=0) { return; }
 * else { z = ar[count-1]; } }
 */