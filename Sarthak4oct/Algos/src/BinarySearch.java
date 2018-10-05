import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinarySearch {

	private Scanner s;
	public void OpenFile() {
		try {
			s = new Scanner(new File("/home/administrator/SArthak4oct/file.text"));
		} catch (FileNotFoundException e) {
			System.out.println("No file found");
		}
	}
	public String[] readFile() {
		String st="";
		while(s.hasNext()) {
			 st= s.next();
			//System.out.println(ar);
		}
		String[] sts = st.split(",");
	return sts;
			}
	public static void sortInsertion(String[] ar){
		//String[] ar = {"bb","cc","ee","dd","aa"};
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
			System.out.println(ar[i]);
		}
	}
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		bs.OpenFile();
		String[] sts = bs.readFile();
		Utility.BinarySString(sts, "chirag");
		sortInsertion(sts);
	}
}
