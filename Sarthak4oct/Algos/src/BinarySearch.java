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
	
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		bs.OpenFile();
		String[] sts = bs.readFile();
		Utility.BinarySString(sts, "chirag");
	}
}
