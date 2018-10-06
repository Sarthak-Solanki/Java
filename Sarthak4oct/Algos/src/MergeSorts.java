
public class MergeSorts {
	public static void devide(int ar[],int low,int high) {
		if(low==high) {
			return;
		}
		else if(low<high) {
		int mid = (low+high)/2+1;
		//int[] arz = ar;
		devide(ar,low,mid-1);
		devide(ar,mid,high);
	merge(ar, low, mid, high);
	}}
	public static void merge(int ar[],int low,int mid,int high) {
		while(low<high) {
			int ar1[] = new int[ar.length/2-1];
			int ar2[] = new int[ar.length-ar1.length];
			
			int i = 0;
			if(ar[low]<ar[high]) {
				ar1[i] = ar[low];
				low++;
			}
			else {
				ar2[i] = ar[high];
				high++;
			}
		}
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	public static void main(String[] args) {
		int ar[] = {5,2,3,4};
		int low = 0;
		int high = ar.length-1;
		devide(ar, low, high);
	}
}
