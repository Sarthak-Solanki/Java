import java.util.ArrayList;

import javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon;

public class PrimeNumberRunner {
public static void main(String[] args) {
	ArrayList<Integer> a= Util.primeNumber();
	for (Integer integer : a) {
		boolean b = Util.palindromeInteger(integer);
		if(b)
			System.out.println(integer);
	}
	System.out.println("****anagram********");
	Util.anagramInteger(a);
}
}
