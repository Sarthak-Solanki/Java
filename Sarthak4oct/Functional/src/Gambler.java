import java.util.Scanner;

public class Gambler {
public static void bet(int stake,int goal,int times) {
	double win = 0;
	double lost = 0;
	int noofbets=0;
	
	for (int i = 0; i < times; i++) {
		int temp = stake;
		noofbets++;
		while(temp>0&&temp<goal) {
			if(Math.random()<0.5) {
				temp++;
			}
			else {
				temp--;
			}
		}
		if(temp==goal) {
			win++;
		}
		else if(temp==0) {
			lost++;
		}
	}
	System.out.println("win "+win+" times");
	System.out.println("lost "+lost+" times");
	double perofwin = (win)/noofbets*100;
	double peroflost = (lost)/noofbets*100;
	System.out.println("% of win "+perofwin);
	System.out.println("% of lost "+peroflost);
}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your stake");
	int stake = s.nextInt();
	System.out.println("Enter your goal");
	int goal = s.nextInt();
	System.out.println("Enter no. of times");
	int times = s.nextInt();
	bet(stake, goal, times);
	s.close();
}
}
