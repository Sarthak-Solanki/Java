
public class Binary {
	public static void swap(String st) {
		//String st = "0000111101011010";
		String st3="";
		String[] st2 = new String[st.length()/4];
		int l=0;
		String fina="";;
		int i = 1;
		while (i<=st.length()) {
			st3 = st3+st.charAt(i-1);
			if(i%4==0) {
				st2[l++] = st3;
				st3="";
			}
			i++;
		}
		int count = 0;

		for (int j = 0; j < st2.length; j++) {
			for (int j2 = j+1; j2 < st2.length; j2++) {
				String temp;
				temp = st2[j];
				st2[j] = st2[j2];
				st2[j2] = temp;
				count++;
				j++;
				//System.out.println(count+" "+st2[j]+" "+st2[j2]);
				if(count>=1) {
					j++;
					j2++;
				}
			}
		}
	
		for (int j = 0; j < st2.length; j++) {
			fina = fina+st2[j];
		}
		System.out.println("Swapped string is:"+fina);
		
		
		long n = Integer.parseInt(fina);
	
		long decimal = 0;
		long p = 0;
		long temp = 0;
	
		for (int j = 0; j < fina.length(); j++) {
			long temp2 = n;
			temp = temp2%10;
			decimal+=  (temp*Math.pow(2,p));
			n=n/10;
			p++;
		}
		System.out.println();
		// decimal = decimal-1;
		System.out.println("decimal is:"+decimal);
	}


	public static void main(String[] args) {
		//String st = 
		swap(ConversionBinary.DecToBin());
	}
}

