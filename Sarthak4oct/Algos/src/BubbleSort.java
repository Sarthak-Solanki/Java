import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {
	private Scanner s;
	ArrayList<Integer> is = new ArrayList<Integer>();

	public void OpenFile() {
		try {
			s = new Scanner(new File("/home/administrator/SArthak4oct/IntFile.text"));
		} catch (FileNotFoundException e) {
			System.out.println("No file found");
		}
	}

	public Integer[] readFile() {
		int count = 0;
		while (s.hasNext())
		{
			is.add(s.nextInt());
			}
		
		Integer[] is2 = is.toArray(new Integer[is.size()]);
		    return is2;

	}

	public static void bubbleSort(Integer[] ar) {
		// int[] ar = {5,6,7,2,1,3,8,9,4};
		for (int k = 1; k < ar.length; k++) {
			for (int i = 0; i < ar.length - 1; i++) {
				// int j = ;
				if (ar[i]>(ar[i + 1])) {
					int temp = ar[i];
					ar[i] = ar[i + 1];
					ar[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(+ar[i]);
		}
	}

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		bs.OpenFile();
		Integer[] ar = bs.readFile();
		bubbleSort(ar);
	}
}
