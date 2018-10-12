

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class UnOrderList {
	static UnorderLinkedList<String> l = null;
	public static void file() throws Exception {
		File f = new File("/home/administrator/SArthak4oct/UnOrderList.text");
		BufferedReader s = null;
		try {
			s = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String strs="";
		l = new UnorderLinkedList<String>();
		int i ;
		String st="";
		while( (st = s.readLine()) != null) {
			strs = st;
		}
		String str[] = strs.split(" ");
		for (String string : str) {
			//System.out.println(string);
			l.add(string);	
		}
	}
	public static void main(String[] args) throws IOException {
		try {
			file();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		l.display();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word you want to find and remove");
		String st = s.nextLine();
		l.display();
		if(l.search(st)) {
			l.remove(st);
			
		}
		else {
			System.out.println("Adding data");
			l.add(st);
			Files.write(Paths.get("/home/administrator/SArthak4oct/UnOrderList.text"),l.getData().getBytes());
		}
	l.display();
	l.getData();
		
	}


}
