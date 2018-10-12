import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;

public class OrderList<G> {
	static OrderedLinkedList<String> l = new OrderedLinkedList<String>();
public static void file() throws Exception {
	
	File f = new File("/home/administrator/SArthak4oct/OrderList.text");
	BufferedReader br = null;
	try {
		br = new BufferedReader(new FileReader(f));
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	String st = "";
	String sts = "";
	while( (st = br.readLine()) != null) {
		sts = st;
	}
	String str[] = sts.split(" ");
	for (String string : str) {
		//System.out.println(string);
		l.add(string);	
	}
}
public static void main(String[] args) throws Exception {
	file();
l.display();
OrderedLinkedList.reArrange();
l.display();
}
}
