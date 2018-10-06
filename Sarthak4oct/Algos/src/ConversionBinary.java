import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ConversionBinary {
	public static String DecToBin() {
		//10/10 = 1;
		//10%10 = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number you want to convert");
		int i = s.nextInt();
		String st = "";
		
		while(i!=0) {
			int z = i%2 ;
			st = z+st;
			i = i/2;
		}
		System.out.println(st);
		if(st.length()%4==0) {
			s.close();
	
			return (st);
		}
		
		
		int lenlef = st.length();
		
		while(lenlef>=4) {
			lenlef = st.length()-4;
		}
		lenlef = 4-lenlef;
		if(st.length()%4!= 0) {
			//int st2 = (st.length()-1)/4;
			//System.out.println();
			for (int j = 0; j <lenlef; j++) {
				st = 0+st;
			}
		}
		System.out.println(st);
		System.out.println(st);
		s.close();
		return (st);
	
	}
	
	public static void main(String[] args) {
		DecToBin();
	}
}
