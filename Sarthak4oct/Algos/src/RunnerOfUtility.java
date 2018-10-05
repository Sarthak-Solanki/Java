
public class RunnerOfUtility {

	public static void main(String[] args) {

		System.out.println("Insertion Sort");
		long sTimeInsertion = System.nanoTime();
		int[] a = Utility.insertionSort();
		long stTimeInsertion = System.nanoTime();
		long Inserfinal = stTimeInsertion-sTimeInsertion;

		System.out.println();

		System.out.println("Insertion sort string:");
		long ssinsertion = System.nanoTime();
		String[] st = Utility.insertionSortString();
		long stsinsertion = System.nanoTime();
		long sinfinal = ssinsertion-stsinsertion;

		System.out.println();

		System.out.println("Binary search");
		long sbinary = System.nanoTime();
		Utility.BinarySearch(a,4);
		long stbinary = System.nanoTime();
		long bifinal= sbinary-stbinary;

		System.out.println();

		System.out.println("Binary string search");
		long ssbinary = System.nanoTime();
		Utility.BinarySString(st, "cc");
		long stsbinary = System.nanoTime();
		long sbfinal = ssbinary-stsbinary;	

		System.out.println();

		System.out.println("BubbleSort Integer:");
		long sbubble = System.nanoTime();
		Utility.bubbleSort();
		long stbubble = System.nanoTime();
		long bbfinal = sbubble-stbubble;

		System.out.println();

		System.out.println("BubbleSort String:");
		long ssbubble = System.nanoTime();
		Utility.bubbleSortString();
		long stsbubble = System.nanoTime();
		long bbsfinal = ssbubble-stsbubble;
	}
}
