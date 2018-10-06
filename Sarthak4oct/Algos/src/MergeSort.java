import java.util.Scanner;

public class MergeSort {
	public static void Merge(int l[],int r[],int main[]) {
		int ll = l.length;
		int rl =  r.length;
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<ll&&j<rl) {
			if(l[i]<r[j]) {
				main[k] = l[i];
				i++;
				k++;
			}
			else {
				main[k] = r[j];
				j++;
				k++;
			}

		}
		while(i<ll) {
			main[k] = l[i];
			i++;
			k++;
		}
		while(j<rl) {
			main[k] =r[j];
			j++;
			k++;
		}
		
	}
	public static void devide(int main[]) {
		int n = main.length;
		if(n<2) 
			return;

		int mid = n/2;
		int[] left = new int[mid];
		int[] right = new int[n-mid];
		for (int i = 0; i <= mid-1; i++) {
			left[i] = main[i];
		}
		for (int i = mid; i <= n-1; i++) {
			right[i-mid] = main[i];
		}
		devide(left);
		devide(right);
		Merge(left, right, main);

	}
	public static void main(String[] args) {

		//int[] l = {1,2,4,6};
		//int[] r = {3,5,7,8};
		int[] main = {1,2,4,6,3,5,7,8};

		devide(main);	
		for (int k2 = 0; k2 < main.length; k2++) {
			System.out.println();
			System.out.println(main[k2]);	
		}
		
	}
}
