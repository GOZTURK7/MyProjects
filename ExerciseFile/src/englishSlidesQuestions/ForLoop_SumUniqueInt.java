package englishSlidesQuestions;

public class ForLoop_SumUniqueInt {

	public static void main(String[] args) {

		/*
		 type code to find the sum of the unique of an integer
		 */
		
		// 1st WAY 
		String num ="254235";
		int sumUnique = 0;
		
		for(int i=0; i < num.length(); i++) {
			char c = num.charAt(i);
			if(num.indexOf(c) == num.lastIndexOf(c)) {
				
				int uniq = Integer.valueOf(num.substring(i, i+1));
				sumUnique+=uniq;

			}
		}
		System.out.println(sumUnique);

		
		
		
		// 2ND WAY; BURADA BİR TRIC VAR ÖNEMLİ !!!!!!!!!
		
		String num1 ="254235";
		int sumUnique1 = 0;
		
		for(int i=0; i < num1.length(); i++) {
			char c = num1.charAt(i);
			if(num1.indexOf(c) == num1.lastIndexOf(c)) {
				
				String cs = ""+c;// TRİCK; Burada çhar olan "c" yi 
								//string olan hiçlik "" ile topladığımızda otomatik stringe çevriyor.
				 sumUnique1 = sumUnique1 + Integer.valueOf(cs);

			}
		}
		System.out.println(sumUnique1);
	}

}
