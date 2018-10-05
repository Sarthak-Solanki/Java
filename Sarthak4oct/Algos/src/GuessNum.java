import java.util.Scanner;

class GuessNum{



	public static void guessGAme(){
				int ar[] = {1,2,3,4,5,6,7,8,9};
				System.out.println("Guess the number between 1-9");
				Scanner s = new Scanner(System.in);
				int low = 0;
				int high = ar.length-1;
				int mid = 0;
				while(low<=high) {
					mid = (low+high)/2;
					if(ar[mid]<n)
						low = mid+1;
					else if(ar[mid]>n) {
						high = mid-1;
					}
					else {
						System.out.println(mid);
						break;}
				}
		
	}
	public static void main(String[] args) {
		guessGAme();
	}
}