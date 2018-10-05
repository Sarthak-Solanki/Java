
public class Utility {
	public static void BinarySearch(int[] ar,int n){
		//int ar[] = {1,2,3,4,5,6,7,8,9};

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
	public static void BinarySString(String[] st,String s) {
		//String st[] = {"a","b","c","d","e"};
		int low = 0;
		int high = st.length-1;
		int mid = 0;
		while(low<=high) {
			mid = (low+high)/2;
			if(st[mid].compareTo(s)<0)
				low = mid+1;
			else if(st[mid].compareTo(s)>0) {
				high = mid-1;
			}
			else {
				System.out.println(mid);
				break;}
		}
	}
	public static int[] insertionSort() {
		int[] ar = {1,3,2,6,5,4,8,7,9};
		for (int i = 1; i < ar.length; i++) {
			int value = ar[i];
			int temp = i;
			while(temp>0&&ar[temp-1]>value) {
				ar[temp]= ar[temp-1];
				temp = temp-1;
			}
			ar[temp] = value;
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		}
		return ar;
	}
	public static String[] insertionSortString() {
		String[] ar = {"bb","cc","ee","dd","aa"};
		for (int i = 1; i < ar.length; i++) {
			String value = ar[i];
			int temp = i;
			while(temp>0&&ar[temp-1].compareTo(value)>0) {
				ar[temp]= ar[temp-1];
				temp = temp-1;
			}
			ar[temp] = value;
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		}
		return ar;
	}
	public static void bubbleSort() {

		int[] ar = {8,4,5,6,2,1,3};
		for(int k = 1;k<ar.length;k++) {
			for(int i=0;i<ar.length-1;i++) {
				//int j = ;
				if(ar[i]>ar[i+1]) {
					int temp = ar[i];
					ar[i] = ar[i+1];
					ar[i+1] = temp;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		}
	}
	public static void bubbleSortString() {
		String[] ar = {"vv","dd","ss","bb","mm","ff","ll"};
		for(int k = 1;k<ar.length;k++) {
			for(int i=0;i<ar.length-1;i++) {
				//int j = ;
				if(ar[i].compareTo(ar[i+1])>0) {
					String temp = ar[i];
					ar[i] = ar[i+1];
					ar[i+1] = temp;
				}
			}
		}

		for (int i = 0; i < ar.length; i++) {

			System.out.print(ar[i]);
		}
	}
	public static void main(String[] args) {

	}
}
